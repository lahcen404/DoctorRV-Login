package com.CONTROLLER;


import com.Utils.DBConnection;
import java.sql.Connection;


public class LoginServlet {
    public static void main(String[] args) {

        Connection conn = DBConnection.getConnection();


        if (conn != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Connection failed!");
        }
    }
}

