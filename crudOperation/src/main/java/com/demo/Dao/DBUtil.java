package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection conn;
	public static Connection getMyConnection() {
		if(conn==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="JDBC:mysql://localhost:3306/j2ee?useSSL=false";
				conn=DriverManager.getConnection(url,"root","welcome");
				return conn;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void closeConnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
