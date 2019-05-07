package com.aandb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	    Employee employee = new Employee();
	    employee.setName("Adrian Rolando");
	    employee.setLastName("Bedregal Vento");
	    employee.setE_mail("rolandobedregal321@gmail.com");
	    
	    request.getSession().setAttribute("emp", employee);
	    
	    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/index.jsp");
        dispatcher.forward(request, response);
	}
}
