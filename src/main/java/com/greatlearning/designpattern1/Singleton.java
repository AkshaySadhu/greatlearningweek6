package com.greatlearning.designpattern1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Singleton {
    public Singleton(){

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCConnection jdbcConnection = new JDBCConnection();
        Connection conn = JDBCConnection.getConnection();
        if(conn != null){
            System.out.println("Connection Successful");
        }

        System.out.println("Retrieving information from Database.");

        Scanner scanner = new Scanner(System.in);
        CrudOperations crudOperations = new CrudOperations();
        boolean loop = true;
        while(loop){
            System.out.println("!!!! Welcome to User CRUD operations !!!!");
            System.out.println("Enter your operation: ");
            System.out.println("1. Registration");
            System.out.println("2. Update");
            System.out.println("3. Display Data");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("");
            int option = scanner.nextInt();
            switch (option){
                case 1: crudOperations.registration();
                    break;
                case 2: crudOperations.update();
                    break;
                case 3: crudOperations.display();
                    break;
                case 4: crudOperations.delete();
                    break;
                case 5: loop = false;
                    break;
            }
        }

    }
}

