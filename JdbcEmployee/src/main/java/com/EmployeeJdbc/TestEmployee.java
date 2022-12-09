package com.EmployeeJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TestEmployee {
@SuppressWarnings("resource")
public static void main(String[] args) throws SQLException {
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	Scanner scanner=null;
	int rowsInserted = 0;
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","DataGuard432$");
	System.out.println("Database connection successful!\\n");
	int selection = 0;
	if(selection < 6) {
		System.out.println("welcome admin:");
		System.out.println("[");
		System.out.println("\t1. add a new Employee,");
		System.out.println("\t2. see all employee,");
		System.out.println("\t3. search an employee,");
		System.out.println("\t4. delete an employee,");
		System.out.println("\t5. update an employee");
		System.out.println("\t6. Exit");
		System.out.println("]");
		System.out.println("select a number between 1 - 5:");
	}
	
	scanner = new Scanner(System.in);
	selection=Integer.parseInt(scanner.next());
	try {
		if(selection >6) {
			System.out.println("invalid selection ");
			System.out.println("please enter again ! ");
			scanner = new Scanner(System.in);
			selection=Integer.parseInt(scanner.next());
		}
	if(selection ==1) {
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
		ps=con.prepareStatement(insertSqlQuery);
		ps.setInt(1,employee.getId());
    	ps.setString(2,employee.getLastName());
    	ps.setString(3,employee.getFirstName());
    	ps.setString(4,employee.getEmail());
    	ps.setString(5, employee.getDepartment());
    	ps.setDouble(6, employee.getSalary());
    	rowsInserted = ps.executeUpdate();
    	
    	if(rowsInserted>0) {
    		System.out.println("Employee details inserted successfully");
    	}	
	
	}
	
	if(selection==2) {
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
	
	if(selection ==3 ) {
		System.out.println("Search Employee Form:");
		System.out.println("[");
		System.out.println("\t1.Search By ID");
		System.out.println("\t2.Search By FirstName");
		System.out.println("\t3.Search By LastName");
		System.out.println("\t4.Search By Dept");
		System.out.println("\t5.Search By Salary");
		
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
	else if(selection==4) {
		
		System.out.println("delete Employee By id:");
		System.out.println("enter the id:");
		String id = scanner.next();
		ps = con.prepareStatement("delete FROM Employees WHERE id=" + id + ";");
		int rowsdeleted=ps.executeUpdate();
		if(rowsdeleted>0) {
		
		
		
		
		System.out.println( id+  "succesfully delted");
		
		}
	}
      else if(selection==5) {
		
		System.out.println("update Employee By id:");
		System.out.println("enter the id:");
		String id = scanner.next();
		ps = con.prepareStatement("update Employees set salary =111111 WHERE id=" + id + ";");
		int rowsupdated=ps.executeUpdate();
		if(rowsupdated>0) {
		
		
		
		
		System.out.println( id + " - succesfully updated");
		
		}
	}
	
	
		
	
	}
	
	catch (Exception exc) {
		exc.printStackTrace();
	}
	finally {
		if (rs != null) {
			rs.close();
		}
		
		if (ps != null) {
			ps.close();
		}
		
		if (con != null) {
			con.close();
		}
	}
}

}
