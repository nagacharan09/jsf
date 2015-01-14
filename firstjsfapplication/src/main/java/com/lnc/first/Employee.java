package com.lnc.first;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;

@ManagedBean(name = "employee")
public class Employee implements Serializable {

	private static Map<String, Employee> employees = new TreeMap<String, Employee>();
	private String id;
	private String name;
	private String department;
	private int age;
	private double salary;
	private String email;

	public Employee() {
	}

	public Employee(String name, String department, int age, double salary) {
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String submit() {
		Employee employee = this;
		System.out.println("Name:::...!!" + employee.getName());
		employees.put(employee.getId(), employee);
		return "EmployeeList";
	}

	public List<Employee> getEmployees() {
		return new ArrayList<Employee>(employees.values());
	}

	public Employee getEmployee(int id) {
		return employees.get(id);
	}

	public String addEmployee() {
		System.out.println("addEmployee");
		return "employee";
	}

}
