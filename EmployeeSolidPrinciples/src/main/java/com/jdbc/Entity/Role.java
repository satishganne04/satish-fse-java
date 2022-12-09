package com.jdbc.Entity;

public class Role {
	private int Id;
	private String LastName;
	private String FirstName;
	private String password;
	private String role;
	@Override
	public String toString() {
		return "Role [Id=" + Id + ", LastName=" + LastName + ", FirstName=" + FirstName + ", password=" + password
				+ ", role=" + role + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Role(int id, String lastName, String firstName, String password, String role) {
		super();
		Id = id;
		LastName = lastName;
		FirstName = firstName;
		this.password = password;
		this.role = role;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
