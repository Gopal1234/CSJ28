package com.cts;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {
	
	Employee[] empAr= {
			
			new Employee(100,"abc"),
			new Employee(500,"def"),
			new Employee(200,"mno"),
	};
	
	
	
	public Employee findEmployee(int id) {
		
		for(Employee e:empAr) {
			
			if(e.getId()==id) {
				return e;
			}
		}
		
		return null;
	}

}

