package com.jdbc.crudClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.jdbc.Entity.Employee;

//Single Responsibility Principle 
//to get all details
public class AllEmployess {
	
	
	public static void allEmployees() throws SQLException {
		Scanner scanner=null;
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null; 
		int rowsInserted = 0;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","DataGuard432$");
		System.out.println("Database connection successful!\\n");
		scanner = new Scanner(System.in);
		try {
		List<Employee> list=new ArrayList<Employee>();
		ps=con.prepareStatement("select * from Employees");
		rs=ps.executeQuery();
		while(rs.next()) {
	    Employee emp=new Employee();
			
		emp.setId(rs.getInt(1));
		emp.setLastName(rs.getString(2));
		emp.setFirstName(rs.getString(3));
		emp.setEmail(rs.getString(4));
		emp.setDepartment(rs.getString(5));
		emp.setSalary(rs.getDouble(6));
		list.add(emp);
		
		
		
		
	
		System.out.println("Employees Data:");
		System.out.println("----------------");
		System.out.println("ID\tFirstName\tLastName\tEmail\tDepartment\tSalary");
		System.out.println("----------------");
		
		
		ListIterator<Employee> itr=list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}}
		}
		catch(Exception e) {
			
		}
	}
}

