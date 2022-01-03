package com.springbt.employee.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emplist")

public class EmployeeModel {
	@Id
	private int id;
	private String name;
	private int number;

	public EmployeeModel() {
		super();
	}

	public EmployeeModel(int id, String name, int number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
