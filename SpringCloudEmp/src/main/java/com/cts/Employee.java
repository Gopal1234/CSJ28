package com.cts;

public class Employee {
	
	private int id;
	
	private String name;
	
	Technology technology;
	
	public Employee() {
		
	}
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
		
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

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}
	
	
	

}
