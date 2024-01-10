package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;


public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static PreparedStatement insertProduct,displayProduct;
	
	static {
		
		try {
			conn=DBUtil.getMyConnection();
			insertProduct=conn.prepareStatement("insert into product values(?,?,?,?)");
			displayProduct=conn.prepareStatement("select * from product");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void save(Product p) {
		
		try {
			insertProduct.setInt(1,p.getPid());
			insertProduct.setString(2,p.getPname());
			insertProduct.setInt(3,p.getQty());
			insertProduct.setDouble(4,p.getPrice());
			insertProduct.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<Product> displayAll() {
		ArrayList<Product> ls=new ArrayList<>();
		try {
			ResultSet rs=displayProduct.executeQuery();
			while(rs.next()) {
				ls.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4)));
			}
			return ls;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	
	
	

}
