package Structural.adapter.practice;

import java.util.ArrayList;
import java.util.List;

import Structural.adapter.practice.model.Employee;
import Structural.adapter.practice.model.EmployeeCSV;
import Structural.adapter.practice.model.EmployeeDB;
import Structural.adapter.practice.model.adapters.EmployeeAdapterCSV;

public class AdapterDemo {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		Employee e1 = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

		employees.add(e1);

		// Will not work! This is where the adapter comes into play!
		// Employee e2 = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");

		Employee e2 = new EmployeeAdapterCSV(new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com"));

		employees.add(e2);

		System.out.println(employees);
	}
}
