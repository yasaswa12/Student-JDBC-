package com.b745utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con=null;
	public static Connection getConnection(){
		try {
			//1.loading
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.connection establishment
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee","root","yasaswa@1234");
			 
		}catch(Exception e) {
				e.printStackTrace();
		}
		return con;
	}
}
