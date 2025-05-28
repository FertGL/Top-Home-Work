package Servers.HomeWork.workWithDB.Models;

import java.sql.*;

public class SubjectModel {
    private final String URL;
    private final String USERNAME;
    private final String PASS;

    public SubjectModel() {
        URL = "jdbc:mysql://127.0.0.1:3306/javaApiProjectDB";
        USERNAME = "root";
        PASS = "Gleb01012003";
    }

    public boolean add(String name) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
            Statement statement = connection.createStatement();

            String sqlQuery = "INSERT INTO Subject (Name)\n" +
                    "VALUES (?);";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                preparedStatement.setString(1, name);
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

            String sqlQuery = "SELECT * FROM Subject";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " +
                        resultSet.getString(2));
            }
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(String name, short id) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
            Statement statement = connection.createStatement();

            statement.executeUpdate("UPDATE Subject\n" +
                    "SET name = '" + name + "'\n" +
                    "WHERE id = " + id + ";");
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

            statement.executeUpdate("DELETE FROM Subject\n" +
                    "WHERE name = '" + name + "'");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
