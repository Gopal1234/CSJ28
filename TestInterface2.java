package cyber.demos;

interface SalaryCalculator
{
	double calculateSalary(double basicPay, double  hra, double ta, double ma, double pf, double tds);
public  double getTdsRate();
	
	
}


class WiproInd implements SalaryCalculator
{

	@Override
	public double calculateSalary(double basicPay, double hra, double ta, double ma, double pf, double tds) {
		// TODO Auto-generated method stub
		System.out.println("cALLING INDIA CLASS");
		return (basicPay+hra+ta+ma)-(pf+tds);
	}

	@Override
	public double getTdsRate() {
		// TODO Auto-generated method stub
		return 10.6;
	}
	
}
class WiproUSA implements SalaryCalculator
{

	@Override
	public double calculateSalary(double basicPay, double hra, double ta, double ma, double pf, double tds) {
		// TODO Auto-generated method stub
		return (basicPay+hra+ta+ma)-(pf+tds);
	}

	@Override
	public double getTdsRate() {
		// TODO Auto-generated method stub
		return 11;
	}
	
}
class WiproAus implements SalaryCalculator
{

	@Override
	public double calculateSalary(double basicPay, double hra, double ta, double ma, double pf, double tds) {
		// TODO Auto-generated method stub
		return (basicPay+hra+ta+ma)-(pf+tds);
	}

	@Override
	public double getTdsRate() {
		// TODO Auto-generated method stub
		return 15;
	}
	
}
public class TestInterface2 {

	public static void main(String[] args) {
		 SalaryCalculator calculator;
		 calculator=new WiproInd();
		 System.out.println("The salary for indian employee" + " "+calculator.calculateSalary(8000, 15000, 5000, 8000, 1000, 10000));
         calculator=new WiproUSA();
         System.out.println("The salary for usa employee" + " "+calculator.calculateSalary(9000, 5000, 5000, 8000, 1000, 10000));
	
         calculator=new WiproAus();
         System.out.println("The salary for aus employee" + " "+calculator.calculateSalary(9000, 5000, 9000, 8000, 1000, 1000));
	}
	
	}


