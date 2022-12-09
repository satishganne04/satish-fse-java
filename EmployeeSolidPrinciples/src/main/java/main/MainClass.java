package main;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.java.scanner.ScannerClass;
import com.java.userDetails.ValidateDetails;
import com.java.userDetails.validateDetailsImpl;
import com.jdbc.Entity.Role;


public class MainClass {
	public static void main(String[] args) throws SQLException {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome to the Application!");
	
//	ScannerClass.scanner();
	

	System.out.println("Enter UserName");
	String username = scanner.next();
	
	ValidateDetails validate=new validateDetailsImpl();
	
		Role role = validate.validateUserDeatils(username);
	
	if (role.getRole().equalsIgnoreCase("Admin")) {
		System.out.println("success");
		ScannerClass.scanner();
	}
	
	else if(role.getRole().equalsIgnoreCase("user")){
		System.out.println("user");
	}
	
	
	
	
	
}}
