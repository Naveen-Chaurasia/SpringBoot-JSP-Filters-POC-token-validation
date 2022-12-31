package com.naveen.JSPFilters.controller;

import com.naveen.JSPFilters.domains.Employee;

public class Controller {
	
	
	
	public Employee createEmployee()
	{
	Employee e=new Employee();
	
	e.setEmployeeID(0);
	e.setEmployeeAddress("Pune");
	e.setEmployeeName("Naveen");
	e.setEmployeeAge("23");
	return e;
	}
}
