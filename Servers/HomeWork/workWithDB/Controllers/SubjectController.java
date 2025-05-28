package Servers.HomeWork.workWithDB.Controllers;

import Servers.HomeWork.workWithDB.MainController;
import Servers.HomeWork.workWithDB.Models.SubjectModel;

import java.util.Scanner;

public class SubjectController {
    private final SubjectModel subjectModel;


    public SubjectController() {
        this.subjectModel = new SubjectModel();
    }

    public void controller() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        sb.append("1. Добавить предмет" + "\n");
        sb.append("2. Изменить информацию о предметах" + "\n");
        sb.append("3. Удалить предмет" + "\n");
        sb.append("4. Вывести информацию о предметах" + "\n");
        sb.append("5. Назад" + "\n");
        System.out.println(sb);
        String chose = scanner.next();

        switch (chose) {
            case "1" -> {
                System.out.println("Введите название предмета: ");
                String subName = scanner.next();

                subjectModel.add(subName);
                controller();
            }
            case "2" -> {
                System.out.println("Введите ID предмета: ");
                short id = scanner.nextShort();
                System.out.println("Введите НОВОЕ название предмета: ");
                String subName = scanner.next();

                subjectModel.update(subName,id);
                controller();
            }
            case "3" -> {
                System.out.println("Введите название предмета: ");
                String subName = scanner.next();

                subjectModel.delete(subName);
                controller();
            }
            case "4" -> {
                subjectModel.get();
                controller();
            }
            case "5" -> MainController.start();
        }
    }
}
