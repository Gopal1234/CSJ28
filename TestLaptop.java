package cyber.demos;

public class TestLaptop {

	public static void main(String[] args) {

    Laptop laptop1=new Laptop("Dell", 45000);
    Laptop laptop2=new Laptop("Dell",45000);
    if(laptop1.equals(laptop2))
    {
    	System.out.println("both objects are same");
    	//System.out.println(laptop1.hashCode() + " "+laptop2.hashCode());
    }
    else
    {
    	System.out.println("not same");
    	//System.out.println(laptop1.hashCode() + " "+laptop2.hashCode());
    }
    System.out.println(laptop1);
    System.out.println(laptop2);
	}

}
