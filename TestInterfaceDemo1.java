package cyber.demos;

interface A1
{
 
}
class Abc 
{
	public boolean accept(Abc obj)
	{
		if(obj instanceof A1)
		{
			return true;
		}
		return false;
	}
}
public class TestInterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Abc obj=new Abc();
		 boolean result= obj.accept(obj);
		 System.out.println(result);
	}

}
