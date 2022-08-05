package Behavioral.momento.practice;

import java.util.Stack;

import Behavioral.momento.practice.model.Employee;

//caretaker
public class Caretaker {

	private Stack<EmployeeMemento> employeeHistory = new Stack<>();
	
	public void save(Employee emp) {
		employeeHistory.push(emp.save());
	}
	
	public void revert(Employee emp) {
		emp.revert(employeeHistory.pop());
	}
}
