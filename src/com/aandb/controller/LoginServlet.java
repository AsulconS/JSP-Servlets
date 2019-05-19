package com.aandb.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aandb.dao.StudentDAO;
import com.aandb.model.beans.Student;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    StudentDAO studentDAO;
    
    public void init()
    {
        System.out.println("Initializing LoginServlet");
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
        
        try
        {
            studentDAO = new StudentDAO(jdbcURL, jdbcUsername, jdbcPassword);
        }
        catch(SQLException e)
        {
            System.out.println("Failed to create StudentDAO!");
        }
    }
    
    public LoginServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	    System.out.println("User logging");
		handleRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}
	
	private void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	    String name = request.getParameter("name");
	    String lastName = request.getParameter("lastName");
	    String e_mail = request.getParameter("e_mail");
	    
	    Student student = new Student();
	    student.setName(name);
	    student.setLastName(lastName);
	    student.setE_mail(e_mail);
	    
	    try
	    {
	        studentDAO.insert(student);
	    }
	    catch(SQLException e)
	    {
	        System.out.println("UNABLE TO INSERT");
	    }
	    
	    try
	    {
	        List<Student> students = studentDAO.listStudents();
	        request.setAttribute("students", students);
	    }
	    catch (SQLException e)
	    {
	        System.out.println("UNABLE TO LOAD");
	    }
	    
	    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/splash.jsp");
	    dispatcher.forward(request, response);
	}
}
