package cyber.demos;

abstract class Rbi
{
	double amt=5000.00;
	Rbi()
	{
		System.out.println("welcome to bank portal");
	}
	
	public double deposit(double amt)
	{
		this.amt=this.amt+amt;
		return this.amt;
	}
	public abstract boolean getBanking(Rbi rbi);
}

class SBI extends Rbi
{

	@Override
	public boolean getBanking(Rbi rbi) {
		if(rbi instanceof SBI)
		{
			return true;
		}
		return false;
	}
	
}
class HDFC extends Rbi
{

	@Override
	public boolean getBanking(Rbi rbi) {
		if(rbi instanceof HDFC)
		{
			return true;
		}
		return false;
	}
	
}
public class TestAbstractDemo1 {
	public static void main(String[] args) {
		Rbi rbi;
		rbi=new SBI();
		if(rbi.getBanking(rbi))
		{
			System.out.println("SBI is valid bank");
		}
		rbi=new HDFC();
		if(rbi.getBanking(rbi))
		{
			System.out.println("HDFC is valid bank");
		}
	}

}
