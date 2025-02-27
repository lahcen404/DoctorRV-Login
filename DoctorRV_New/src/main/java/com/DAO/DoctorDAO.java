package com.DAO;

import java.sql.*;
import com.MODEL.Doctor;
import com.Utils.DBConnection;


public class DoctorDAO {

    private Connection con;
    public DoctorDAO() {   //constructor bach initializes  conn variable
        con = DBConnection.getConnection();
    }

    public void registerDoctor(Doctor doctor) {

        try {
            String query = "insert into doctors(name,email,password,speciality) values(?,?,?,?)";
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setString(1, doctor.getName());
            stmnt.setString(2, doctor.getEmail());
            stmnt.setString(3, doctor.getPassword());
            stmnt.setString(4, doctor.getSpeciality());
            stmnt.executeUpdate();
          // return  stmnt.executeUpdate() > 0; // reeturn true if insertion was successful
        } catch (Exception e) {
            e.printStackTrace();
           // return false;

        }
    }


    public Doctor validateDoctor(String email, String password) {
        Doctor doctor = null;
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM doctors WHERE email = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                doctor = new Doctor();
                doctor.setId(rs.getInt("id"));
                doctor.setName(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctor;
    }

}
