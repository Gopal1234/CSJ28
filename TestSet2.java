package cyber.demos;

import java.util.HashSet;
import java.util.Set;

public class TestSet2 {
	public static void main(String[] args) {
		
		Set<Integer> set1=new HashSet();
		set1.add(10);
		set1.add(1);
		set1.add(45);
		set1.add(367);
		
		set1.add(15);
		
		Set<Integer> set2=new HashSet();
		set2.add(10);
		set2.add(12);
		set2.add(45);
		set2.add(336);
		
		//merging two set
	//boolean addAll(collection object);
		//set1.addAll(set2);
		
		//System.out.println(set1);
		
		
		//set1.removeAll(set2);
		//System.out.println(set1);
		
		set1.retainAll(set2);
		System.out.println(set1);
		
	}

}
