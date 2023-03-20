package cyber.demos;

class A
{
	void show1()
	{
		System.out.println("Hi I am from A block");
	}
}
class B extends A
{
	void show2()
	{
		System.out.println("Hi I am from B block");
	}
}

public class TestTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A parent;
		parent=new B();
		parent.show1();
		
		B child=(B)parent;
	child.show1();
	child.show2();
		
		

	}

}
