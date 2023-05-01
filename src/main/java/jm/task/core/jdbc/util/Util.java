package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    public static final String URL = "jdbc:mysql://localhost:3306/mydb";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static Connection getConnection () {
        Connection connection = null;

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
}

