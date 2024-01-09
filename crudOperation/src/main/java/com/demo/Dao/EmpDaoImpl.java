package com.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmpDaoImpl implements EmpDao {

	public static Connection conn;
	static PreparedStatement getEmp;
	
	static {
		
		try {
			conn=DBUtil.myConnection();
			getEmp=conn.prepareStatement("select * from employee");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Employee> showAll() {
		List<Employee> elist=new ArrayList<>();
		try {
			ResultSet rs=getEmp.executeQuery();
			while(rs.next()) {
				elist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3)));				
			}
			return elist;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
