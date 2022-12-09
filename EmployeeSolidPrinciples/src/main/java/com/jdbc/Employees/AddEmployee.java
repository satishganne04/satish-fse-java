package com.jdbc.Employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.Entity.Employee;

public class AddEmployee {
	@SuppressWarnings("null")
	public static void addEmployee() throws SQLException {
		
		Scanner scanner=null;
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null; 
		int rowsInserted = 0;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","DataGuard432$");
		System.out.println("Database connection successful!\\n");
		scanner = new Scanner(System.in);
		Employee employee=new Employee();
		System.out.println("Add employee Form");
		System.out.println("------------------");
		System.out.println("Enter Id:");
		employee.setId(scanner.nextInt());
		System.out.println("Enter last name:");
		employee.setLastName(scanner.next());
		System.out.println("Enter firstname:");
		employee.setFirstName(scanner.next());
		System.out.println("Enter email:");
		employee.setEmail(scanner.next());
		System.out.println("Enter department:");
		employee.setDepartment(scanner.next());
		System.out.println("Enter salary:");
		employee.setSalary(scanner.nextDouble());
		
		String insertSqlQuery="INSERT INTO `employees` (`id`,`last_name`,`first_name`,`email`,"
				+ "`department`, `salary`) VALUES (?,?,?,?,?,?);";
		try {
			ps=con.prepareStatement(insertSqlQuery);
			ps.setInt(1,employee.getId());
	    	ps.setString(2,employee.getLastName());
	    	ps.setString(3,employee.getFirstName());
	    	ps.setString(4,employee.getEmail());
	    	ps.setString(5, employee.getDepartment());
	    	ps.setDouble(6, employee.getSalary());
	    	rowsInserted = ps.executeUpdate();
	    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	if(rowsInserted>0) {
    		System.out.println("Employee details inserted successfully");
    	}	
		
	}

}
