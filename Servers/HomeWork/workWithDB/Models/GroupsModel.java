package Servers.HomeWork.workWithDB.Models;

import java.sql.*;
import java.util.Scanner;

public class GroupsModel {
    private final String URL;
    private final String USERNAME;
    private final String PASS;

    public GroupsModel() {
        URL = "jdbc:mysql://127.0.0.1:3306/javaApiProjectDB";
        USERNAME = "root";
        PASS = "Gleb01012003";
    }

    public boolean add(String name, byte year) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
            Statement statement = connection.createStatement();

            String sqlQuery = "INSERT INTO grups (name,year)\n" +
                    "VALUES (?,?);";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, year);
                preparedStatement.executeUpdate();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean get() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
            Statement statement = connection.createStatement();

            String sqlQuery = "SELECT * FROM grups";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " +
                        resultSet.getString(2) + " " +
                        resultSet.getString(3));
            }
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String name) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
            Statement statement = connection.createStatement();

            String sqlUpdate = "DELETE FROM grups\n" +
                    "WHERE name = '" + name + "'";

            statement.executeUpdate(sqlUpdate);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update() {
        StringBuilder sb = new StringBuilder();

        sb.append("1. Изменить название группы" + "\n");
        sb.append("2. Изменить курс" + "\n");

        System.out.println(sb);
        Scanner scanner = new Scanner(System.in);
        int chose = scanner.nextInt();

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
            Statement statement = connection.createStatement();

            switch (chose) {
                case 1 -> {
                    System.out.println("Введите СТАРОЕ название группы: ");
                    String oldName = scanner.next();

                    System.out.println("Введите НОВОЕ название группы: ");
                    String newName = scanner.next();
                    int sqlUpdateRows = statement.executeUpdate("UPDATE grups\n" +
                            "SET name = '" + newName + "'\n" +
                            " WHERE name = '" + oldName + "';");
                    return true;
                }
                case 2 -> {
                    System.out.println("Введите название группы: ");
                    String name = scanner.next();
                    System.out.println("Введите НОВЫЙ номер курса: ");
                    short newYear = (short) scanner.nextInt();
                    int sqlUpdateRows = statement.executeUpdate("UPDATE grups\n" +
                            "SET year = '" + newYear + "'\n" +
                            " WHERE name = '" + name + "';");
                    return true;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
