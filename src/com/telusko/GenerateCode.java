package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenerateCode
 */
@WebServlet("/GenerateCode")
public class GenerateCode extends HttpServlet {
	
	public void service(HttpServletRequest rq, HttpServletResponse rs) throws IOException
	{
		String fname = rq.getParameter("fname");
		String lname = rq.getParameter("lname");
		PrintWriter pw = rs.getWriter();
		pw.println("Your code is "+fname+fname.length()+lname+lname.length());
	}
	
}
