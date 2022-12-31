package com.naveen.JSPFilters.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.JSPFilters.domains.Employee;



@RestController
public class Controller {
	
	@GetMapping("/getEmployee")
	public Employee createEmployee()
	{
	Employee e=new Employee();
	e.setEmployeeID(0);
	e.setEmployeeAddress("");
	e.setEmployeeName("Naveen");
	e.setEmployeeAge("23");
	return e;
	}
}
