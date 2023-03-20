package cyber.demos;

class Parent
{
	void displayMsg(String msg)
	{
		System.out.println("Hi" + " "+msg);
	}
}
class Child extends Parent
{
	void displayMsg(String msg)
	{
		System.out.println("Hello" + " "+msg);
	}
}


public class TestInheritanceDemo4 {

	public static void main(String[] args) {

       Parent p=new Child();
       Child c=(Child)p;
       c.displayMsg("hello all");

	}

}
