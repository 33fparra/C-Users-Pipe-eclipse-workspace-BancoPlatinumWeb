package com.platinum.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Aquí puedes añadir lógica para validar el nombre de usuario y contraseña
        if ("admin".equals(username) && "password".equals(password)) {
            response.getWriter().println("Login exitoso");
        } else {
            response.getWriter().println("Login fallido");
        }
    }
}
