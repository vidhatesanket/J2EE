package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Calculation extends HttpServlet{
	public  int fact(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		return num*fact(num-1);
	}
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		int first=Integer.parseInt(req.getParameter("num1"));
		int second=Integer.parseInt(req.getParameter("num2"));
		String op=req.getParameter("Operation");
		
		switch (op) {
			case "Addition": 
				out.print("<h2><center>Addition :"+(first+second));
				break;
			
			case "Factorial": 
				out.print("<h2>factorial of first number: "+ fact(first));
				out.print("<h2>factorial of Second number: "+ fact(second));
				break;
				
			default : break;
			
		}
		out.print("<h1><center>Thank you!!!</center><h1>");
		
		
	}
}

