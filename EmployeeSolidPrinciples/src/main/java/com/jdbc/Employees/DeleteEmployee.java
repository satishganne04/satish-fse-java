package com.jdbc.Employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {
	
	
	public static void deleteEmployee() throws SQLException {
		Scanner scanner=null;
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null; 
		int rowsInserted = 0;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","DataGuard432$");
		System.out.println("Database connection successful!\\n");
		scanner = new Scanner(System.in);
		try {
		scanner = new Scanner(System.in);
		System.out.println("delete Employee By id:");
		System.out.println("enter the id:");
		String id = scanner.next();
		ps = con.prepareStatement("delete FROM Employees WHERE id=" + id + ";");
		int rowsdeleted=ps.executeUpdate();
		
		if(rowsdeleted>0) {
		System.out.println( id+  " - succesfully delted");
		
		}}
		catch(Exception e) {
			
		}
	}

}
