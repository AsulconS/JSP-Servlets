package com.aandb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aandb.model.beans.Student;

@WebServlet("/servlet")
public class Servlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    
    public Servlet()
    {
        super();
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        handleRequest(request, response);
	}
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }
    
    private void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Student student = new Student();
        student.setName("Adriann Rolando");
        student.setLastName("Bedregal Vento");
        student.setE_mail("rolandobedregal321@gmail.com");
        
        request.getSession().setAttribute("student", student);
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/index.jsp");
        dispatcher.forward(request, response);
    }
}
