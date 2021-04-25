package com.dependencyInjection;

import org.springframework.stereotype.Component;
//Component is used to let the spring know that the class 'Salary' is a component of Spring bean
@Component
public class Salary {
	private double basicSalary;
	private double HRA;
	private double DA;
	
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getHRA() {
		return HRA;
	}
	public void setHRA(double hRA) {
		HRA = hRA;
	}
	public double getDA() {
		return DA;
	}
	public void setDA(double dA) {
		DA = dA;
	}
	@Override
	public String toString() {
		return "Salary [basicSalary=" + basicSalary + ", HRA=" + HRA + ", DA=" + DA + "]";
	}
	
	public void salaryCredit() {
		System.out.println("Salary getting processed !");
	}
}
