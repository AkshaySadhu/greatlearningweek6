package com.greatlearning.designpattern1;

import java.sql.*;
import java.util.Scanner;

public class CrudOperations {


    public void registration() throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);

        Connection connection = JDBCConnection.getConnection();
        Statement statement = connection.createStatement();

        System.out.println("Enter First Name");
        String firstName = scanner.next();
        System.out.println("Enter Last Name");
        String lastName = scanner.next();
        System.out.println("Enter Email ID");
        String email = scanner.next();
        int userID;
        ResultSet resultSet = statement.executeQuery("Select max(userID) from greatlearing_week5");
        if(resultSet.next()){
            userID = resultSet.getInt(1) + 1;
        }else {
            userID = 1;
        }
        String sqlStatement = "INSERT INTO greatlearing_week5(userID, firstName, lastName, email) values('" + String.valueOf(userID) + "'" + firstName + "'" + lastName + "'" + email + "')";
        statement.executeUpdate(sqlStatement);
        connection.commit();
        connection.close();
    }

    public void update() throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = JDBCConnection.getConnection();
        Statement statement = connection.createStatement();

        System.out.println("Enter the User ID to update");
        int userID = scanner.nextInt();
        System.out.println("Enter the column name to update");
        System.out.println("1.First Name   2. Last Name   3. Email");
        int choice = scanner.nextInt();
        String columnName = "email";
        if(choice == 1){
            columnName = "firstName";
        }else if(choice == 2){
            columnName = "lastName";
        }else if(choice == 3){
            columnName = "email";
        }
        System.out.println("Enter updated value");
        String value = scanner.next();
        String sqlStatement = "UPDATE greatlearing_week5 SET " + columnName + " = '" + value + "' WHERE userID = '" + String.valueOf(userID);

        statement.executeUpdate(sqlStatement);
        connection.commit();
        connection.close();
    }

    public void display() throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = JDBCConnection.getConnection();
        Statement statement = connection.createStatement();

        System.out.println("Enter the User ID to display");
        int userID = scanner.nextInt();
        String sqlStatement = "SELECT firstName, lastName, email FROM greatlearing_week5 WHERE userID = '" + userID + "'";
        ResultSet resultSet = statement.executeQuery(sqlStatement);
        if(resultSet.next()){
            System.out.println("Name: " + resultSet.getString(1) + " " + resultSet.getString(2));
            System.out.println("Email: " + resultSet.getString(3));
        }
        connection.close();
    }

    public void delete() throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);

        Connection connection = JDBCConnection.getConnection();
        Statement statement = connection.createStatement();

        System.out.println("Enter the User ID to delete");
        int userID = scanner.nextInt();
        String sqlStatement = "DELETE FROM greatlearing_week5 WHERE userID = '" + userID + "'";
        statement.executeUpdate(sqlStatement);
        connection.commit();
        connection.close();
    }
}
