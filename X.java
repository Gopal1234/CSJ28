package cyber.pack1;

import java.util.Date;

public class X {

	public String displayMsg()
	{
		Date date=new Date();
		int hours=date.getHours();
		System.out.println(hours);
		if(hours>=1 && hours<12)
		{
			return "Good Morning";
		}else if(hours>12 && hours<=16)
		{
			return "Good afternoon";
		}else if(hours>16 && hours<=21 )
		{
			return "Good evening";
		}else if(hours>21 && hours<=24)
		{
			return "Good night";
		}
		
		
		
		
		return "Welcome";
	}
	
	
}
