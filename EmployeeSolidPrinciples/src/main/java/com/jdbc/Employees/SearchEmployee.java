package com.jdbc.Employees;

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


public class SearchEmployee {
	
	public static void searchEmployee() throws SQLException {
		
		Scanner scanner=null;
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null; 
		int rowsInserted = 0;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","DataGuard432$");
		System.out.println("Database connection successful!\\n");
		scanner = new Scanner(System.in);
		
		System.out.println("Search Employee Form:");
		System.out.println("[");
		System.out.println("\t1.Search By ID");
		System.out.println("\t2.Search By FirstName");
		System.out.println("\t3.Search By LastName");
		System.out.println("\t4.Search By Dept");
		System.out.println("\t5.Search By Salary");
		try {
		List<Employee> list=new ArrayList<Employee>();
		
		int searchSelection = scanner.nextInt();
		
		if(searchSelection==1) {
			System.out.println("Search Employee By ID:");
			System.out.println("enter the id:");
			int id = scanner.nextInt();
			ps = con.prepareStatement("SELECT * FROM Employees WHERE id=" + id + ";");
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
			}
			
			System.out.println("Employees Data:");
			System.out.println("----------------");
			System.out.println("ID\tFirstName\tLastName\tEmail\tDepartment\tSalary");
			System.out.println("----------------");
			
			ListIterator<Employee> itr=list.listIterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	
	else if(searchSelection==2) {
		System.out.println("Search Employee By firstName:");
		System.out.println("enter the firstname:");
		String firstName = scanner.next();
		ps = con.prepareStatement("SELECT * FROM Employees WHERE first_name='" + firstName + "';");
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
		}
		
		System.out.println("Employees Data:");
		System.out.println("----------------");
		System.out.println("ID\tFirstName\tLastName\tEmail\tDepartment\tSalary");
		System.out.println("----------------");
		
		ListIterator<Employee> itr=list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	else if(searchSelection==3) {
		System.out.println("Search Employee By lastName:");
		System.out.println("enter the lastname:");
		String firstName = scanner.next();
		ps = con.prepareStatement("SELECT * FROM Employees WHERE last_name='" + firstName + "';");
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
		}
		
		System.out.println("Employees Data:");
		System.out.println("----------------");
		System.out.println("ID\tFirstName\tLastName\tEmail\tDepartment\tSalary");
		System.out.println("----------------");
		
		ListIterator<Employee> itr=list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
		}
catch(Exception e) {
			
		}
		
	}
	}

