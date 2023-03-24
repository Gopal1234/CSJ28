package cyber.demos.functionalProgramming;

public class TestPanCardProvider {
	
	
	public static void main(String[] args) {
		
		/*PanCardServiceProvider obj=new PanCardServiceProvider() {
			
			@Override
			public boolean validatePanNumber(String panNumber) {
				
				//first five character should be alphabet
				//next 4 character shouldbe digit
				//last character is alphabet
				String regEx="[A-Z]{5}[0-9]{4}[A-Z]{1}";
				if(panNumber.matches(regEx))
				{
					return true;
				}
				return false;
			}
		};*/
	/*PanCardServiceProvider obj=	   (p1)->{String regEx="[A-Z]{5}[0-9]{4}[A-Z]{1}";
			if(p1.matches(regEx))
			{
				return true;
			}
			return false;};*/
		
		//PanCardServiceProvider obj=	(p1, p2)->{return p1+p2;};
		
		//System.out.println(obj.add(30,80));
		PanCardServiceProvider obj=()->{System.out.println("Happy Gudi Padwa");};
		
		obj.show1();
		/*boolean status=obj.validatePanNumber("AB11234P");
		System.out.println(status);
		if(status)
		{
			System.out.println("valid pan number");
		}
		else
		{
			System.out.println("invalid pan format");
		}*/
		
	}

}
