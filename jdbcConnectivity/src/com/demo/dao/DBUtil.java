package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn=null;
	
	public static Connection getMyConnection() {
		if(conn==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/someshdb?useSSL=false";
				conn=DriverManager.getConnection(url,"root","welcome");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return conn;
	}
}
