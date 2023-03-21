package cyber.demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestMap1 {

	public static void main(String[] args) {
		Map<Integer, String> map1=new HashMap();
		/*map1.put(1,"abc");
		map1.put(200, null);
		map1.put(15, "xyz");
		map1.put(5,null);*/
		
		
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter roll number");
			int rollNo=scanner.nextInt();
			System.out.println("Enter name");
			String name=scanner.next();
			map1.put(rollNo, name);
		}
		
		
		System.out.println("The size of the map"+ " "+map1.size());
		//I want to check whether map containing 200 as key or not
     if( map1.containsKey(200))
      {
    	  map1.replace(200, "adffd");
      }
       //keySet()---set<Key>
       Set<Integer> keySets= map1.keySet();
       System.out.println(keySets);
        Iterator<Integer> itr=keySets.iterator();
        while(itr.hasNext())
        {
        	//System.out.println(itr.next());
        	int key=  itr.next();
        String value=	map1.get(key);
        System.out.println(key + " ->>"+ ""+value);
        	
        }
     
	}

}
