package main;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cyber.pack1.Address;
import cyber.pack1.Passenger;
import cyber.pack1.Train;

public class TrainDriver {

	public static void main(String[] args) {
 //ApplicationContext is one of the component which implements Spring Container
//ApplicationContext provides many implementation classes to configure the bean description
//It support annotation based configuration as well as Xml based configuration
//ApplicationContext load beans at the time of spring container starts		
		
		

		ApplicationContext context=new ClassPathXmlApplicationContext("train.xml");
	//Train train=(Train)   context.getBean("trainObj");
		
		Train trainObj=	  context.getBean("trainObj", Train.class);
	Map<Integer, Passenger> trainDetails=	trainObj.getTrainInfo();
/*Set<Entry<Integer, String>> entrySet=	trainDetails.entrySet();
  for(Map.Entry<Integer, String> me:entrySet)
  {
	  System.out.println(me.getKey()+ " "+me.getValue());
  }*/
	
	   Set<Integer> setOfKey= trainDetails.keySet();
	Iterator<Integer> itr=    setOfKey.iterator();
	while(itr.hasNext())
	{
		int trainNumber=itr.next();
		Passenger pObj=trainDetails.get(trainNumber);
		Address address=pObj.getAdress();
		/*System.out.println(trainNumber + " --->"+
		trainDetails.get(trainNumber).getPassengerName()+ " "
				+trainDetails.get(trainNumber).getContactNumber() + " "+
		          trainDetails.get(trainNumber).getAdress().getCity() + " "+
				  trainDetails.get(trainNumber).getAdress().getPinCode()
				
				);*/
		
System.out.println(trainNumber + " ->"+ " "+pObj.getPassengerName()+ " "+
pObj.getContactNumber() + " "+address.getCity() + " "+address.getPinCode());		
		
		
		
		
		
	} 
	}

}
