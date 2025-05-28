package Servers.HomeWork.workWithDB.Controllers;

import Servers.HomeWork.workWithDB.MainController;
import Servers.HomeWork.workWithDB.Models.GroupsModel;

import java.util.Scanner;

public class GroupsController {
    private final GroupsModel groupsModel;

    public GroupsController() {
        this.groupsModel = new GroupsModel();
    }

    public void controller() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        sb.append("1. Добавить группу" + "\n");
        sb.append("2. Изменить информацию о группе" + "\n");
        sb.append("3. Удалить группу" + "\n");
        sb.append("4. Вывести информацию о группах" + "\n");
        sb.append("5. Назад" + "\n");
        System.out.println(sb);
        String chose = scanner.next();

        switch (chose) {
            case "1" -> {
                System.out.println("Введите название группы: ");
                String groupName = scanner.next();

                System.out.println("Введите курс группы: ");
                byte groupYear = scanner.nextByte();

                System.out.println(groupsModel.add(groupName, groupYear));
                controller();
            }
            case "2" -> {
                groupsModel.update();
                controller();
            }
            case "3" -> {
                System.out.println("Введите название группы: ");
                String groupName = scanner.next();
                groupsModel.delete(groupName);
                controller();
            }
            case "4" -> {
                groupsModel.get();
                controller();
            }
            case "5" -> {
                MainController.start();
            }
        }
    }
}
