package com.jdbc.crudClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//Single Responsibility Principle 
//to update employee
public class UpdateEmployee {

	public static void updateEmployee() throws SQLException {
		Scanner scanner=null;
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null; 
		int rowsInserted = 0;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","DataGuard432$");
		System.out.println("Database connection successful!\\n");
		scanner = new Scanner(System.in);
		
		try {
		System.out.println("update Employee By id:");
		System.out.println("enter the id:");
		String id = scanner.next();
		ps = con.prepareStatement("update Employees set salary =111111 WHERE id=" + id + ";");
		int rowsupdated=ps.executeUpdate();
		if(rowsupdated>0) {
		
		
		
		
		System.out.println( id + " - succesfully updated");
		
		}
	
	}
	catch(Exception e) {
		
	
	}

}}
