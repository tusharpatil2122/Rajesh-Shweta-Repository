package com.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Employee {

	@Id
	@Setter
	@Getter
	private int emp_Id;
	private String emp_Name;
	private float emp_Salary;
	private String company_Name;

}
