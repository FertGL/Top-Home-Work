package Servers.HomeWork.workWithDB.Models;

import java.sql.*;
import java.util.Scanner;

public class TeacherModel {
    private final String URL;
    private final String USERNAME;
    private final String PASS;

    public static void main(String[] args) {
        TeacherModel teacherModel = new TeacherModel();
        teacherModel.add("Gleb","Fert",200000);
    }
    public TeacherModel() {
        URL = "jdbc:mysql://127.0.0.1:3306/javaApiProjectDB";
        USERNAME = "root";
        PASS = "Gleb01012003";
    }

    public boolean add(String name, String surname, Integer salary) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
            Statement statement = connection.createStatement();

            String sqlQuery = "INSERT INTO Teachers (Name,Surname,Salary)\n" +
                    "VALUES (?,?,?);";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, surname);
                preparedStatement.setInt(3, salary);
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

            String sqlQuery = "SELECT * FROM Teachers";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " +
                        resultSet.getString(2) + " " +
                        resultSet.getString(3) + " " +
                        resultSet.getInt(4));
            }
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update() {
        StringBuilder sb = new StringBuilder();

        sb.append("1. Изменить имя" + "\n");
        sb.append("2. Изменить фамилию" + "\n");
        sb.append("3. Изменить оклад" + "\n");

        System.out.println(sb);
        Scanner scanner = new Scanner(System.in);
        int chose = scanner.nextInt();

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
            Statement statement = connection.createStatement();

            switch (chose) {
                case 1 -> {
                    System.out.println("Введите ID преподавателя: ");
                    short id = scanner.nextShort();

                    System.out.println("Введите новое имя: ");
                    String newName = scanner.next();
                    int sqlUpdateRows = statement.executeUpdate("UPDATE Teachers\n" +
                            "SET Name = '" + newName + "'\n" +
                            " WHERE Id = " + id + ";");
                    return true;
                }
                case 2 -> {
                    System.out.println("Введите ID преподавателя: ");
                    short id = scanner.nextShort();
                    System.out.println("Введите новую фамилию: ");
                    String newSurname = scanner.next();
                    int sqlUpdateRows = statement.executeUpdate("UPDATE Teachers\n" +
                            "SET Surname = '" + newSurname + "'\n" +
                            " WHERE Id = " + id + ";");
                    return true;
                }
                case 3 -> {
                    System.out.println("Введите ID преподавателя: ");
                    short id = scanner.nextShort();
                    System.out.println("Введите новый оклад: ");
                    int newSalary = scanner.nextInt();
                    int sqlUpdateRows = statement.executeUpdate("UPDATE Teachers\n" +
                            "SET Salary = " + newSalary + "\n" +
                            "WHERE Id = " + id + ";");
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public boolean delete(String name) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
            Statement statement = connection.createStatement();

            String sqlUpdate = "DELETE FROM Teachers\n" +
                    "WHERE name = '" + name + "'";

            statement.executeUpdate(sqlUpdate);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
