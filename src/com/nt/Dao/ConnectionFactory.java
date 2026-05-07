package com.nt.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static Connection con = null;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/product?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "root"
            );
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        return con;
    }
}
