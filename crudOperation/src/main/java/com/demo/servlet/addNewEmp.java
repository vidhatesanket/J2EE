package com.demo.servlet;

import java.io.IOException;

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
 * Servlet implementation class addNewEmp
 */
@WebServlet("/addNewEmp")
public class addNewEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("employeeid"));
		String name=request.getParameter("employeename");
		double sal=Double.parseDouble(request.getParameter("employeesal"));
		Employee emp=new Employee(id,name,sal);
		EmpService eserv=new EmpServiceImpl();
		eserv.addNewEmployee(emp);
		RequestDispatcher rd=request.getRequestDispatcher("displayEmployees");
		rd.forward(request, response);
		

	}

}















