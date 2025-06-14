package Servers.HomeWork.workWithDB.Controllers;

import Servers.HomeWork.workWithDB.MainController;
import Servers.HomeWork.workWithDB.Models.TeacherModel;

import java.util.Scanner;

public class TeacherController {
    private final TeacherModel teacherModel;

    public TeacherController() {
        this.teacherModel = new TeacherModel();
    }

    public void controller() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        sb.append("1. Добавить преподавателя" + "\n");
        sb.append("2. Изменить информацию о преподавателях" + "\n");
        sb.append("3. Удалить преподавателя" + "\n");
        sb.append("4. Вывести информацию о преподавателях" + "\n");
        sb.append("5. Назад" + "\n");
        System.out.println(sb);
        String chose = scanner.next();

        switch (chose) {
            case "1" -> {
                System.out.println("Имя преподавателя: ");
                String teacherName = scanner.next();
                System.out.println("Зарплата: ");
                int salary = scanner.nextInt();
                System.out.println("Фамилия преподавателя: ");
                String teacherSurname = scanner.next();


                System.out.println(teacherModel.add(teacherName, teacherSurname, salary));
                controller();
            }
            case "2" -> {
                teacherModel.update();
                controller();
            }
            case "3" -> {
                System.out.println("Имя преподавателя: ");
                String teacherName = scanner.nextLine();
                if (teacherName.isEmpty()) {
                    teacherName = scanner.nextLine();
                }
                System.out.println(teacherModel.delete(teacherName));
                controller();
            }
            case "4" -> {
                teacherModel.get();
                controller();
            }
            case "5" -> {
                MainController.start();
            }

        }
    }
}
