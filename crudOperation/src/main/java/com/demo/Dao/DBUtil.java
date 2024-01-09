package com.demo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection conn;
	public static Connection myConnection() {
		if(conn==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/temp?useSSL=false";
				DriverManager.getConnection(url,"root", "Sanket@01");
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		return conn;
	}
	public static void closeConnnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
