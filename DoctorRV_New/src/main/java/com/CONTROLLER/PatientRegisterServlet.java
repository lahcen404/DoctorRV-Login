package com.CONTROLLER;

import com.DAO.PatientDAO;
import com.MODEL.Patient;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/patientRegister")
public class PatientRegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private PatientDAO PatientDAO;
    @Override
    public void init() throws ServletException {
        PatientDAO = new PatientDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("patientRegister.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");

        Patient patient = new Patient(name, email, password, phone);
        PatientDAO patientDAO = new PatientDAO();

//

        patientDAO.registerPatient(patient);
        response.sendRedirect("Login.jsp");
    }

}