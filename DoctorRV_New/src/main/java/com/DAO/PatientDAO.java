package com.DAO;

import java.sql.*;
import com.MODEL.Patient;
import com.Utils.DBConnection;


public class PatientDAO {

    private final Connection con;
    public PatientDAO() {   //constructor bach initializes  conn variable
        con = DBConnection.getConnection();
    }

    public void registerPatient(Patient patient) {

        try {
            String query = "insert into patients(name,email,password,phone) values(?,?,?,?)";
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setString(1, patient.getName());
            stmnt.setString(2, patient.getEmail());
            stmnt.setString(3, patient.getPassword());
            stmnt.setString(4, patient.getPhone());
            stmnt.executeUpdate();
            // return  stmnt.executeUpdate() > 0; // reeturn true if insertion was successful
        } catch (Exception e) {
            e.printStackTrace();
            // return false;

        }
    }


    public Patient validatePatient(String email, String password) {
        Patient patient = null;
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM patients WHERE email = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                patient = new Patient();
                patient.setId(rs.getInt("id"));
                patient.setName(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return patient;
    }

}