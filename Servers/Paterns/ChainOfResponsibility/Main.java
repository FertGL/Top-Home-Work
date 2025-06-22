package Servers.Paterns.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Account {
    private String cardNumber;
    private String fullName;
    private double money;
    private int pin;

    public Account(String cardNumber, String fullName, double money, int pin) {
        this.cardNumber = cardNumber;
        this.fullName = fullName;
        this.money = money;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}


class AccountDataBase {
    public static List<Account> accounts;

    static {
        accounts = new ArrayList<>();

        accounts.add(new Account("111111", "Fert Gleb", 1000, 1111));
        accounts.add(new Account("222222", "Ivan Ivanov", 5000, 2222));
    }
}

interface iMoneyOperationHandler {
    void setNext(iMoneyOperationHandler next);

    void handle(String cardNumber, int pin, double money);
}

class VerifyAccountHandler implements iMoneyOperationHandler { private iMoneyOperationHandler next;

    @Override
    public void setNext(iMoneyOperationHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String cardNumber, int pin, double money) {
        boolean accountExists = AccountDataBase.accounts
                .stream()
                .anyMatch(
                        account ->
                                account.getCardNumber().equals(cardNumber) &&
                                        account.getPin() == pin);

        if (accountExists) {
            if (next!=null) next.handle(cardNumber,pin,money);
        } else {
            System.out.println("Error! Invalid account");
        }
    }
}

class CheckMoneyHandler implements iMoneyOperationHandler {
    private iMoneyOperationHandler next;

    @Override
    public void setNext(iMoneyOperationHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String cardNumber, int pin, double money) {
        Account acc = AccountDataBase.accounts
                .stream()
                .filter(account -> account.getCardNumber().equals(cardNumber) && account.getPin() == pin)
                .findFirst()
                .orElse(null);

        if (acc!=null && acc.getMoney() >= money) {
            if (next!=null) next.handle(cardNumber,pin,money);
        } else {
            System.out.println("Error! Not enough money!");
        }
    }
}

class MoneyOperationLoggerHandler implements iMoneyOperationHandler {

    private iMoneyOperationHandler next;

    @Override
    public void setNext(iMoneyOperationHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String cardNumber, int pin, double money) {
        System.out.println("[" + new Date().toString() + "] - Card number : " + cardNumber + " , Amount : " + money);
        if (next!=null) next.handle(cardNumber,pin,money);

    }
}

class RecieveMoneyHandler implements iMoneyOperationHandler {
    private iMoneyOperationHandler next;
    @Override
    public void setNext(iMoneyOperationHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String cardNumber, int pin, double money) {
        Account acc = AccountDataBase.accounts
                .stream()
                .filter(account -> account.getCardNumber().equals(cardNumber) && account.getPin() == pin)
                .findFirst()
                .orElse(null);

        if (acc!=null) {
            acc.setMoney(acc.getMoney() - money);
            System.out.println("Transaction succesfull! Your balance : " + acc.getMoney());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        iMoneyOperationHandler verify = new VerifyAccountHandler();
        iMoneyOperationHandler check = new CheckMoneyHandler();
        iMoneyOperationHandler logger = new MoneyOperationLoggerHandler();
        iMoneyOperationHandler receiver = new RecieveMoneyHandler();

        verify.setNext(check);
        check.setNext(logger);
        logger.setNext(receiver);

    }
}
