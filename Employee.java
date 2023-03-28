package cyber.pack1;

import java.util.List;
import java.util.Set;

public class Employee {
	
	
	private int empId;
	private String name;
	private double empSalary;
	private List<Task> listOfTask;
	private Set<Long> phoneNumbers;

	
	
	
	public Employee(int empId, String name, double empSalary, List<Task> listOfTask, Set<Long> phoneNumbers) {
		super();
		this.empId = empId;
		this.name = name;
		this.empSalary = empSalary;
		this.listOfTask=listOfTask;
		this.phoneNumbers=phoneNumbers;
	}



	public int getEmpId() {
		return empId;
	}



	public String getName() {
		return name;
	}



	public double getEmpSalary() {
		return empSalary;
	}



	public List<Task> getListOfTask() {
		return listOfTask;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", empSalary=" + empSalary + ", listOfTask=" + listOfTask
				+ ", phoneNumbers=" + phoneNumbers + "]";
	}



	
	

}
