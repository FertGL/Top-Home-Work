package Servers.HomeWork.workWithDB;

import Servers.HomeWork.workWithDB.Controllers.GroupsController;
import Servers.HomeWork.workWithDB.Controllers.SubjectController;
import Servers.HomeWork.workWithDB.Controllers.TeacherController;

import java.util.Scanner;

public class MainController {
    private static TeacherController teacherController = new TeacherController();
    private static GroupsController groupsController = new GroupsController();
    private static SubjectController subjectController = new SubjectController();

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        sb.append("1.Группы\n");
        sb.append("2.Преподаватели\n");
        sb.append("3.Дисциплины\n");
        sb.append("4.Выход");
        System.out.println(sb);

        String chose = scanner.next();
        switch (chose) {
            case "1" -> groupsController.controller();
            case "2" -> teacherController.controller();
            case "3" -> subjectController.controller();
            case "4" -> System.exit(0);
        }

    }

}
