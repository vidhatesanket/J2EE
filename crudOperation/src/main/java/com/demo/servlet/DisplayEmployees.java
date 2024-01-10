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
 * Servlet implementation class displayEmployees
 */
@WebServlet("/displayEmployees")
public class displayEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpService eserv=new EmpServiceImpl();
		List<Employee> elist=eserv.getAll();
		request.setAttribute("elist", elist);
		RequestDispatcher rd=request.getRequestDispatcher("displayAllEmp.jsp");
		rd.forward(request, response);
		
		
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req,resp);
		}

}



















