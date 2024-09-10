package HW_5_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte b = 100;
        short s = 1000;
        int i = 10;
        long l = 100_000L;
        float f = 1.0f;
        double d = 10.0;
        boolean boo = true;
        char c = '1';

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

    }
}
