package problem7;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	public int employeeid;
	public String name;
	public int salary;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int employeeid, String name, int salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.salary = salary;
	}

	public Employee(ArrayList<Employee> list) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o1.name);
	}
	}


