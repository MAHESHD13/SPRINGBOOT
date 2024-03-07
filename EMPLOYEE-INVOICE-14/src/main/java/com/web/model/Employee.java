package com.web.model;

public class Employee {
	private String empNo;
	private String empName;
	private String empSalary;
	
	//DEFAULT CONSTRUCTOR
	public Employee() {
		super();
	}

	//PARAMETERIZED CONSTRUCTOR
	public Employee(String empNo, String empName, String empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	//GETTERS AND SETTERS METHODS
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	//TOSTRING METHOD
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	

	
	
}
