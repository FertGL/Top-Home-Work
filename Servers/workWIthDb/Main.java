package Servers.workWIthDb;

import org.postgresql.Driver;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            String url = "jdbc:mysql://127.0.0.1:3306/javaApiProjectDB";
            String username = "root";
            String password = "Gleb01012003";

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();

//                statement.executeUpdate(); //DROP , DELETE , INSERT , UPDATE , CREATE
//                statement.execute(); //BOOLEAN
//                statement.executeQuery(); //SELECT

                /// Добавление параметров в таьлицу
//                String sqlQuery = "INSERT INTO Person (id,name,surname)" +
//                                "VALUES (1,'Gleb','Fert')," +
//                                "(2,'Sofiya','Granichka'),"+
//                                "(3,'Sofiya','Deliergieva'),"+
//                                "(4,'Vitaliy','Iliash')";
///                Вывод количества измененных строк
//                 int createrows = statement.executeUpdate(sqlQuery);
//                System.out.println(createrows);

                /// Обход SQL-иньекции
            int id = 5;
            String name = "Юля";
            String surname = "Раскосова";

            String sqlQuery1 = "INSERT INTO Person (id,name,surname) VALUES (?,?,?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1)){
                preparedStatement.setInt(1,id);
                preparedStatement.setString(2,name);
                preparedStatement.setString(3,surname);
            }
                System.out.println("added");
                ///Удаление полей таблицы
//                String sqlQuery = "DELETE FROM Person";
//                int deleterows = statement.executeUpdate(sqlQuery);
//                System.out.println(deleterows);

                ///Вывод Select в консоль
//              String sqlQuery = "SELECT * FROM Person;";
//              ResultSet resultSet = statement.executeQuery(sqlQuery);
//              while (resultSet.next()) {
//                  System.out.println(resultSet.getInt(1) + " " +
//                          resultSet.getString(2) + " " +
//                          resultSet.getString(3));
//              }

//              System.out.println(statement.executeQuery(sqlQuery));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
