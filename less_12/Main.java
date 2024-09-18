package less_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст человека: ");
        int age = scanner.nextInt();

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему надо в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему надо в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему надо в университет.");
        } else if (age >= 25) {
            System.out.println("Если возраст человека равен " + age + ", то ему надо на работу.");
        }
    }

    public static void task2() {
        int dianaSalary = 66660;
        int andreySalary = 77770;
        int marySalary = 88880;

        int newDianaSalary = (int) ((dianaSalary * 0.15) + 66660);     //Увеличение зарплаты
        int newAndreySalary = (int) ((andreySalary * 0.15) + 77770);
        int newMarySalary = (int) ((marySalary * 0.15) + 88880);

        int dianaYearSalary = (newDianaSalary * 12) - (dianaSalary * 12);   //Увеличение годового дохода
        int andreyYearSalary = (newAndreySalary * 12) - (andreySalary * 12);
        int maryYearSalary = (newMarySalary * 12) - (marySalary * 12);

        System.out.println("Диана теперь зарабатывает: " + newDianaSalary + ". Годовой доход вырос на: " + dianaYearSalary);
        System.out.println("Андрей теперь зарабатывает: " + newAndreySalary + ". Годовой доход вырос на: " + andreyYearSalary);
        System.out.println("Мария теперь зарабатывает: " + newMarySalary + ". Годовой доход вырос на: " + maryYearSalary);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 12,1,2 -> System.out.println("Этот месяц пренадлежит к сезону <<Зима>>");
            case 3,4,5 -> System.out.println("Этот месяц пренадлежит к сезону <<Весна>>");
            case 6,7,8 -> System.out.println("Этот месяц пренадлежит к сезону <<Лето>>");
            case 9,10,11 -> System.out.println("Этот месяц пренадлежит к сезону <<Осень>>");
            default -> System.out.println("Такого месяца не существует");
        }

    }
}
