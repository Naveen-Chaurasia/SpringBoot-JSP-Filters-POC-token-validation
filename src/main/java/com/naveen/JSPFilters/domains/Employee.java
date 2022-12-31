package com.naveen.JSPFilters.domains;

import lombok.Getter;
import lombok.Setter;


public class Employee {
	
	private int EmployeeID;
	private String EmployeeName;
	private String EmployeeAge;
	private String EmployeeAddress;
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeAge() {
		return EmployeeAge;
	}
	public void setEmployeeAge(String employeeAge) {
		EmployeeAge = employeeAge;
	}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}
	 

}
