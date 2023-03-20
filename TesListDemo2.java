package cyber.demos;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Customer
{
	private int customerId;
	private String name;
	private String address;
	private long phone;
	public Customer(int customerId, String name, String address, long phone) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public long getPhone() {
		return phone;
	}
	
	
	
	
	
	
}

class CustomerBO
{
	List<Customer> list=new LinkedList();
	
	public void addCustomer(List<Customer> list)
	{
		this.list=list;
	}
	public List<Customer> getAllCustomer()
	{
		return list;
	}
	
	/*public Customer serachCustomer(int customerId)
	{
		
	}*/
	/*public Customer removeCustomer(int customerId)
	{
		
	}*/
}
public class TesListDemo2 {

	public static void main(String[] args) {
		CustomerBO cbo=new CustomerBO();
		List<Customer> listOfCustomer=new LinkedList();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How namy customer do you want to add");
		int no=Integer.parseInt(scanner.nextLine());
		for(int i=0; i<no; i++)
		{
			System.out.println("Enter customer id");
			int id=Integer.parseInt(scanner.nextLine());
			System.out.println("Enter customer name");
		String name=scanner.nextLine();
		System.out.println("Enter customer address");
		String address=scanner.nextLine();
		System.out.println("Enter customer phone");
		long phone=Long.parseLong(scanner.nextLine());
		Customer customer=new Customer(id, name, address, phone);
		
		listOfCustomer.add(customer);
			}
		
	cbo.addCustomer(listOfCustomer);
	
	
	     List<Customer> customerDetails=cbo.getAllCustomer();
		
	     for(Customer cust:customerDetails)
	     {
	    	 System.out.println(cust.getCustomerId() + " "+cust.getName() + " "+cust.getPhone()+ " "+cust.getAddress());
	     }
	     
		
		
		
		
		
	}

}
