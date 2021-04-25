package com.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Component is used to let the spring know that the class 'Employee' is a component of Spring bean
@Component
public class Employee {
	private int empid;
	private String empname;
	private String address;
	private String email;
	//Autowired is used to link the Employee and Salary class in the Spring bean. 
	@Autowired
	private Salary salary;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + ", email=" + email + "]";
	}
	
	public void Display() {
		System.out.println("Employee Display !");
		salary.salaryCredit();
	}
	
}
