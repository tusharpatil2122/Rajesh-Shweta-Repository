package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.crud.serviceI.EmployeeServiceI;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceI employeeServiceI;
	
	
}
