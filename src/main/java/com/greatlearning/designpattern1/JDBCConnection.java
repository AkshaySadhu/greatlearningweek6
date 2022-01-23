package com.greatlearning.designpattern1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    static Connection connection =  null;

    public static Connection getConnection(){
        if(connection == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtable", "root", "root");
            } catch (ClassNotFoundException throwables) {
                throwables.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return connection;
    }
}
