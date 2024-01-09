package com.demo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

/**
 * Servlet implementation class DisplayEmployees
 */
@WebServlet("/DisplayEmployees")
public class DisplayEmployees extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Employee> elist=new ArrayList<>();
		EmpService eser=new EmpServiceImpl();
		elist=eser.getall();
		request.setAttribute("plist", elist);
		RequestDispatcher rd=request.getRequestDispatcher("showEmp.jsp");
		rd.forward(request, response);
	}

}
