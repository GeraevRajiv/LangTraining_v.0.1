package ru.innopolis.geraev.langtraining.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Rajiv on 06.11.2016.
 */
@WebServlet(name = "Authentication", urlPatterns = "/Authentication")
public class Authentication extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println(request.getParameter("j_username"));
        System.out.println(request.getParameter("j_password"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
