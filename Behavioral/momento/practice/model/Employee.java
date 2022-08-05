package Behavioral.momento.practice.model;

import Behavioral.momento.practice.EmployeeMemento;

//originator
public class Employee {
	
	private String name;
	private String phone;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toString() {
		return name + " : " + phone;
	}
	
	public EmployeeMemento save() {
		return new EmployeeMemento(name, phone);
	}
	
	public void revert(EmployeeMemento emp) {
		this.name = emp.getName();
		this.phone = emp.getPhone();
	}
}