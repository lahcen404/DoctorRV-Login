package com.CONTROLLER;

import com.DAO.DoctorDAO;
import com.DAO.PatientDAO;
import com.MODEL.Doctor;
import com.MODEL.Patient;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        DoctorDAO doctorDAO = new DoctorDAO();
        PatientDAO patientDAO = new PatientDAO();

        HttpSession session = request.getSession();

        // Check if the username belongs to a doctor
        Doctor doctor = doctorDAO.validateDoctor(username, password);
        if (doctor != null) {
            session.setAttribute("user", doctor);
            response.sendRedirect("doctorDashboard.jsp");
            return;  // Exit after redirect
        }

        // Check if the username belongs to a patient
        Patient patient = patientDAO.validatePatient(username, password);
        if (patient != null) {
            session.setAttribute("user", patient);
            response.sendRedirect("patientDashboard.jsp");
            return;  // Exit after redirect
        }

        // If no match was found for either, show error
        request.setAttribute("errorMessage", "Invalid username or password!");
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
}
