package com.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/validateUser")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(user.equals("Root") && pass.equals("Welcome")) {
			out.println("<center><h1 style='color: green' >Welcome<h1><br>"
					+ "<a href='displayEmployees'>Show All Employees</a></center>");
			
		}
		else {
			out.println("<center><h2 style='color: red'>Invalid Credentials</h2></center>");
		}
	}

}