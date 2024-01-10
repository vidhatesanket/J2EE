package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProduct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductService pserv=new ProductServiceImpl();
		int choice=-1;
		
		do {
			System.out.println("1. add new product\n2. Delete product\n3. modify product");
			System.out.println("4. display all\n5. display by id\n6. display in sorted order of price\n 7. exit");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1: {
				pserv.addProduct();
				break;
			}
			case 2: {
							
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				List<Product> plist=pserv.display();
				for(Product p : plist) {
					System.out.println(p);
				}
				break;
			}
			case 5: {
				
				break;
			}
			case 6: {
				
				break;
			}
			
			case 7: {
				
				break;
			}
			default:
				
			}
		}while(choice!=7);
	}
}








