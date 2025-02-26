package com.DAO;

import java.sql.*;
import com.MODEL.Doctor;
import com.Utils.DBConnection;


public class DoctorDAO {

    private Connection con;
    public DoctorDAO() {   //constructor bach initializes  conn variable
        con = DBConnection.getConnection();
    }

    public boolean registerDoctor(Doctor doctor) {

        try {
            String query = "insert into doctors(name,email,password,speciality) values(?,?,?,?)";
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setString(1, doctor.getName());
            stmnt.setString(2, doctor.getEmail());
            stmnt.setString(3, doctor.getPassword());
            stmnt.setString(4, doctor.getSpeciality());

           return  stmnt.executeUpdate() > 0; // reeturn true if insertion was successful
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }

}
