package cyber.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

class Laptop1 
{
	private int laptopId;
	private String brand;
	private double price;
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/*@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
	
		Laptop1 l1=(Laptop1)o1;
		
		Laptop1 l2=(Laptop1)o2;
		if(l1.price>l2.price)
		{
			return 1;
		}
		return -1;
	}*/
	
	
	
	
	
	
	
	
}




public class TestPlayer {

	public static void main(String[] args) {
		//loose coupling
		//this reference of list type can be pluged in by any valid implementation class of list
List<Laptop1> listOfLaptop=new ArrayList();
/*listOfLaptop=new LinkedList<Laptop1>();
listOfLaptop=new Stack<Laptop1>();
listOfLaptop=new Vector<Laptop1>();
//tight coupling
ArrayList<Laptop1> list=new ArrayList();
list=new LinkedList();*/

Scanner scanner=new Scanner(System.in);
System.out.println("Enter number of laptops");
int noL=scanner.nextInt();
for(int i=0; i<noL; i++)
{
	Laptop1 lp=new Laptop1();
	System.out.println("Enter id");
	int id=scanner.nextInt();
	System.out.println("Enter brand");
	String brand=scanner.next();
	System.out.println("enter price");
	double price=scanner.nextDouble();
	lp.setLaptopId(id);
	lp.setBrand(brand);
	lp.setPrice(price);
	listOfLaptop.add(lp);
	
	
}
//Comparator<Laptop1> cmp=new Laptop1();
Comparator<Laptop1> cmp=new Comparator<Laptop1>() {

	@Override
	public int compare(Laptop1 o1, Laptop1 o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice()>o2.getPrice())
		{
			return 1;
		}return -1;
	}
	
};
Collections.sort(listOfLaptop,cmp);

  for(Laptop1 laptop:listOfLaptop)
  {
	  System.out.println(laptop.getLaptopId() + " "+laptop.getBrand()+ " "+laptop.getPrice());
  }

	

	}

}
