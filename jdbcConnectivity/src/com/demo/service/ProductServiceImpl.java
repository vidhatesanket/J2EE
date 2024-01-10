package com.demo.service;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {

	private ProductDao pdao;
	
	public ProductServiceImpl(){
		pdao=new ProductDaoImpl();
	}
	
	public void addProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pid");
		int pid=sc.nextInt();
		System.out.println("Enter the pname");
		String pname=sc.next();
		System.out.println("Enter the quantity");
		int qty=sc.nextInt();
		System.out.println("Enter the price");
		double price=sc.nextDouble();
		Product p=new Product(pid,pname,qty,price);
		
		pdao.save(p);
	}

	@Override
	public List<Product> display() {
		
		return pdao.displayAll();
		
	}

}
