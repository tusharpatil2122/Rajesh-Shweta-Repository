package com.crud.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.repository.EmployeeRepository;
import com.crud.serviceI.EmployeeServiceI;

@Service
public class EmployeeImp implements EmployeeServiceI {

	@Autowired
	EmployeeRepository employeeRepository;
	
}
