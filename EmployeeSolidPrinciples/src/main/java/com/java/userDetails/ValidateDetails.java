package com.java.userDetails;

import java.sql.SQLException;

import com.jdbc.Entity.Role;

public interface ValidateDetails {
	public Role validateUserDeatils(String username) throws SQLException;

}
