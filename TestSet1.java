package cyber.demos;

import java.util.*;

public class TestSet1 {

	public static void main(String[] args) {

		//creating the reference of Set and initializing the object of Hashet
  // Set<Integer> set1=new HashSet();
		//Set<Integer> set1=new LinkedHashSet();
		Set<Integer> set1=new TreeSet();
   /*
    * 1
35
567
10

    * 
    */
   
   set1.add(567);
   set1.add(10);
   set1.add(1);
   set1.add(35);
   
   /* for(Integer i:set1)
    {
    	System.out.println(i);
    }*/
   
   
   Iterator itr=set1.iterator();
   /*System.out.println("Hi"+ " "+ itr.next());
   System.out.println("Hi"+ " "+ itr.next());
   System.out.println("Hi"+ " "+ itr.next());*/
   //System.out.println();
  //hashNext()--boolean
   while(itr.hasNext())
   {
	   System.out.println("Hello");
	  Object obj= itr.next();
	  System.out.println(obj);
   }
   
   
   
  /* set1=new LinkedHashSet();
   set1=new TreeSet();
   //creating the reference of HashSet and initializing the obejct of HashSet
   HashSet set2=new HashSet();
	set2=new TreeSet();*/
   
   
   
   

	}

}
