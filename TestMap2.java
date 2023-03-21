package cyber.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Employee
{
	private int empId;
	private String empName;
	private double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
}

class EmployeeDAO
{
	Map<Integer,Employee> mapOfEmp=new TreeMap();
	public void addEmp(Employee emp)
	{
		mapOfEmp.put(emp.getEmpId(), emp);
	}
	public Map<Integer, Employee> getAllEmployee()
	{
		return mapOfEmp;
	}
	
	
	public Employee searchEmployeeBasedOnId(int empId)
	{
		Set<Entry<Integer, Employee>> entrySet= mapOfEmp.entrySet();
		for(Map.Entry<Integer, Employee> me:entrySet)
		{
			int key=me.getKey();
			Employee emp=me.getValue();
			if(emp.getEmpId()==empId)
			{
				return emp;
			}
			
		}
		
		return null;
	}
	//I need to fetch all employee object whose salary>=50000
	public List<Employee> getEmployeeBasedOnSalary()
	{
		List<Employee> listOfEmp=new ArrayList();
		for(Map.Entry<Integer, Employee> me:mapOfEmp.entrySet())
		{
			Employee e=me.getValue();
			if(e.getEmpSalary()>=50000)
			{
				listOfEmp.add(e);
			}
		}
		return listOfEmp;
		
	}
	
	
	
	
}




public class TestMap2 {

	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDAO();
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i<4; i++)
		{
			Employee e=new Employee();
			System.out.println("Enter id");
			int id=scanner.nextInt();
			System.out.println("Enter name");
			String name=scanner.next();
			System.out.println("Enter salary");
			double salary=scanner.nextDouble();
			e.setEmpId(id);
			e.setEmpName(name);
			e.setEmpSalary(salary);
			
			dao.addEmp(e);
			
			
			
		}
		
		Map<Integer, Employee> map1= dao.getAllEmployee();
		for(Map.Entry<Integer, Employee> me:map1.entrySet())
		{
			System.out.println(me.getKey() + " "+me.getValue().getEmpName() + " "+me.getValue().getEmpSalary());
		}
		
		
		
		//calling search method
		System.out.println("enter employee id");
		int empId=scanner.nextInt();
		Employee e1=  dao.searchEmployeeBasedOnId(empId);
		System.out.println(e1.getEmpName() + " "+e1.getEmpSalary());
		
		
		//calling the salary method
		List<Employee> list=  dao.getEmployeeBasedOnSalary();
		for(Employee e:list)
		{
			System.out.println(e.getEmpName() + " "+e.getEmpSalary());
		}
		

	}

}
