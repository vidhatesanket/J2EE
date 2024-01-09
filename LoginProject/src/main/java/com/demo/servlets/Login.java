
package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		
		
		if(name.equals("Sanket") && pwd.equals("Vidhate")) {
			out.print("<h2><center>Login Successfully</center></h2>");
			RequestDispatcher rd=req.getRequestDispatcher("Calculate.html");
			rd.forward(req, resp);
		}
		else {
			out.print("<h2><center>Invalid Credentials!!</center></h2>");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			//This helps us to re-render again to the the login.html page
			rd.include(req, resp);
		}
		
	}

	

}
