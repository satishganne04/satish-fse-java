package com.java.userDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.Entity.Role;

public class validateDetailsImpl implements ValidateDetails {
	Connection myConn = null;
	PreparedStatement myStmt = null;
	ResultSet myRs = null;
	
	public  Role validateUserDeatils(String LastName) throws SQLException {
	
		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","DataGuard432$");
		myStmt = myConn.prepareStatement("select * from role where LastName=?");
		myStmt.setString(1, LastName);
		myRs = myStmt.executeQuery();
		Role role=new Role();
		while (myRs.next()) {
		role.setId(myRs.getInt("Id"));
		role.setLastName(myRs.getString("LastName"));
		role.setFirstName(myRs.getString("FirstName"));	
		role.setPassword(myRs.getString("passowrd"));
		role.setRole(myRs.getString("role"));
		}
		return role;
		
	}
	}


