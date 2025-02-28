package com.Utils;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection conn;

    public static Connection getConnection() {
       // if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                try {
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DoctorDB2", "root", "lahcen123");
                } catch (Exception e){
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
      //  }
        return conn;
    }
}
