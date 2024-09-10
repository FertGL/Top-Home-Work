package less_9;

import java.util.Scanner;

//TODO Реализовать алгоритм прошлого ДЗ. (Поход на пляж)
public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ; // true -хорошая | false - плохая
//        String weather = sc.nextLine();
//        if (weather.equals("Норм")) {
//            System.out.println("Едем на пляж )");
//            String waterTemp = sc.nextLine();
//            if (waterTemp.equals("Норм")) {
//                System.out.println("Идем купатся!");
//            } else {
//                System.out.println("Иди загорать, потом домой!(" +
//                        "Зря приехал!");
//            }
//        } else {
//            System.out.println("Ложись спать!");
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Проснулся, проверь погоду: ");
        Scanner sc = new Scanner(System.in);
        String weather = sc.nextLine();

        switch (weather) {
            case "Солнечно" -> {
                System.out.println("Едем на пляж");
                String waterTemp = sc.nextLine();
                switch (waterTemp) {
                    case "Теплая" -> {
                        System.out.println("Идем купаться!)");
                        System.out.println("Конец!");
                    }
                    default -> {
                        System.out.println("Иди загорать, потом домой!(\n" +
                        "Зря приехал!");
                        System.out.println("Конец!");
                    }
                }
            }
            default -> {
                System.out.println("Ложись спать");
                System.out.println("Конец!");
            }

        }
    }
}
