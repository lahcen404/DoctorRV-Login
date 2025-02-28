package com.CONTROLLER;

import com.DAO.DoctorDAO;
import com.MODEL.Doctor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doctorRegister")
public class DoctorRegisterServlet extends HttpServlet {
             private static final long serialVersionUID = 1L;
             private DoctorDAO DoctorDAO;
    @Override
    public void init() throws ServletException {
         DoctorDAO = new DoctorDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // For GET requests, you can display the registration form
        request.getRequestDispatcher("doctorRegister.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String speciality = request.getParameter("speciality");
        
        Doctor doctor = new Doctor(name, email, password, speciality);
        DoctorDAO doctorDAO = new DoctorDAO();

//

        doctorDAO.registerDoctor(doctor);
        response.sendRedirect("Login.jsp");
    }

}
