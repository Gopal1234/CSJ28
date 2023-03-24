package cyber.demos.functionalProgramming;

public class TestLoginService {
	public static void main(String[] args) {
		//I am giving input to login object
		Login login1=new Login("admin","admin@123");
	
		//accessing functional interface using lambda expression
LoginService service=(login)->{
			if(login.getUserName().equalsIgnoreCase("admin") && login.getUserPassword().equals("admin@123"))
			{
				return true;
			}
			return false;
		  };
		
		boolean b=service.doLogin(login1);
		if(b)
		{
			System.out.println("you are admin");
		}
		else
		{
			System.out.println("Invalid authentication");
		}
		
	}

}
