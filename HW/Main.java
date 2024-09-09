package HW;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        Integer firstNum = scanner.nextInt();
        Integer secondNum = scanner.nextInt();

        int sum = firstNum + secondNum;
        int subtraction = firstNum - secondNum;
        int multipli = firstNum * secondNum;
        double splitting = firstNum / secondNum;

        System.out.println("Cумма: " + sum);
        System.out.println("Вычитаниеж: " + subtraction);
        System.out.println("Умножение: " + multipli);
        System.out.println("Деление: " + splitting);


        Random rand = new Random();
        int first = rand.nextInt();
        int second = rand.nextInt();
        int third = rand.nextInt();
        int fourth = rand.nextInt();

        System.out.println("Символы: "
                + (char)first
                + (char)second
                + (char)third
                + (char)fourth);


        int i = 2_147_483_647;
        System.out.println("int: " + i);
        System.out.println("int + 1/long: " + (i + 1));
    }
}
