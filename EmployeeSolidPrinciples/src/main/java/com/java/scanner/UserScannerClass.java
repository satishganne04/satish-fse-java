package com.java.scanner;

import java.util.Scanner;

public class UserScannerClass {
	
	public static void userScanner() {

		Scanner scanner=null;
		int selection = 0;
		
		
	System.out.println("welcome user:");
	System.out.println("[");
	System.out.println("\t1. View All Employee,");
	System.out.println("\t2. Your Profile,");
	System.out.println("\t3. search an employee,");
	System.out.println("]");
	System.out.println("select a number between 1 - 3:");
	
	scanner = new Scanner(System.in);
	
	
	selection=Integer.parseInt(scanner.next());
	if (selection ==1) {
		System.out.println("view all employees");
	}
	else if(selection ==2) {
		System.out.println("your profile");
	}
	else if(selection ==3) {
		System.out.println("search an employee");
	}
	
	}

}
