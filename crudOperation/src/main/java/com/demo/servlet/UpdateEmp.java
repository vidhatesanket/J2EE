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
 * Servlet implementation class UpdateEmp
 */
@WebServlet("/updateEmp")
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid=Integer.parseInt(request.getParameter("employeeid"));
		String ename=request.getParameter("employeename");
		double esal=Double.parseDouble(request.getParameter("employeesal"));
		EmpService eserv=new EmpServiceImpl();
		Employee e=new Employee(eid,ename,esal);
		eserv.updateEmp(e);
		RequestDispatcher rd=request.getRequestDispatcher("displayEmployees");
		rd.forward(request, response);
		
		
	}

}