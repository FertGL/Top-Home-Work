package less_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любую строку: ");
        String newStr = sc.nextLine();
        int lowDigit = 0;
        int bigDigit = 0;

        int lowerCaseLetter = 0;
        int upperCaseLetter = 0;


        for (int i = 0; i < newStr.length(); i++) {
            if (Character.isDigit(newStr.charAt(i)) && (newStr.charAt(i) <= '4')) {
                lowDigit++;
            } else if (Character.isDigit(newStr.charAt(i)) && (newStr.charAt(i) >= '5')) {
                bigDigit++;
            }
            if (Character.isLetter(newStr.charAt(i)) && (newStr.charAt(i) == Character.toUpperCase(newStr.charAt(i)))) {
                upperCaseLetter++;
            } else if (Character.isLetter(newStr.charAt(i)) && (newStr.charAt(i) == Character.toLowerCase(newStr.charAt(i)))) {
                lowerCaseLetter++;
            }
        }

        System.out.println("Количество цифр от 0 до 4: " + lowDigit);
        System.out.println("Количество цифр от 5: " + bigDigit);
        System.out.println("Количество маленьких букв: " + lowerCaseLetter);
        System.out.println("Количество больших букв: " + upperCaseLetter);
    }

    public static void task2() {
        String str = "I like Java...";

        System.out.println(str.charAt(str.length()-1)); //а

        System.out.println(str.endsWith("..."));        //b

        System.out.println(str.startsWith("I"));        //c

        System.out.println(str.contains("Java"));       //d

        int index = str.indexOf("like");                //e
        System.out.println(index);

        String newStr = str.replaceAll("a","o"); //f
        System.out.println(newStr);

        String upperCase = str.toUpperCase();           //g
        System.out.println(upperCase);

        String lowerCase = str.toLowerCase();           //h
        System.out.println(lowerCase);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int index = str.length() / 2;

        String twoLetter = str.substring(index-1,index+1);
        System.out.println(twoLetter);
    }
}
