package com.java.scanner;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.crudClasses.AddEmployee;
import com.jdbc.crudClasses.AllEmployess;
import com.jdbc.crudClasses.DeleteEmployee;
import com.jdbc.crudClasses.SearchEmployee;
import com.jdbc.crudClasses.UpdateEmployee;

public class ScannerClass {
	public static void scanner() throws SQLException {
		
		Scanner scanner=null;
		int selection = 0;
		
		
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
	
	scanner = new Scanner(System.in);
	
	
	selection=Integer.parseInt(scanner.next());
	
	String role = null;

	
	if(selection ==1) {
		AddEmployee.addEmployee();
	}
	
	else if(selection ==2) {
		AllEmployess.allEmployees();
	}
	else if(selection ==3) {
		SearchEmployee.searchEmployee();
	}
	
	else if(selection ==4) {
		DeleteEmployee.deleteEmployee();
	}
	else if(selection ==5) {
		UpdateEmployee.updateEmployee();
	}
		
	}
	
	
	
	
	
	
}

