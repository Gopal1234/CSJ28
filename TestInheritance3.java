package cyber.demos;

interface Service1
{
	int customerId=888;
	void showCustomerDetails();
	
}
interface Service2 extends Service1
{
	int productId=123;
	void showProductDetails();
	
}
class C implements Service2
{

	@Override
	public void showProductDetails() {
		System.out.println("showing product details");
		
		System.out.println("The product id is"+ " "+Service2.productId);
	}

	@Override
	public void showCustomerDetails() {
		System.out.println("showing customer details");
		System.out.println("The customer id is"+ " "+Service1.customerId);
		
	}
	//we need to override unimplemented methods
	
}
public class TestInheritance3 {
	public static void main(String[] args) {
		C cObj=new C();
		cObj.showCustomerDetails();
		cObj.showProductDetails();
	}
 

}
