package cyber.demos.functionalProgramming;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFunctionalInterface {

	public static void main(String[] args) {

		//comparator is predefined functioanl interface which provides a single abstract method
		//called compare, which is used to compare two objects
		 Comparator<Integer> cmp=(p1,p2)->{
			 
			if(p1>p2)
			{
				return 1;
			}
			return -1;
			 
		 };

		System.out.println(cmp.compare(10, 30));
		//Predicate is a functional interface , inside java.util.function package
		//Predicate provides one method called  boolean test(T t)
	
	 Predicate<String> predicate=(p1)->{
		if(p1.length()>=5)
		{
			return true;
		}
		return false;
	 };
		
  System.out.println(predicate.test("Gopal"));
	
  //Consumer is an prdefined functional interface inside java.util.Function package
  //Consumer provide a single method called  void accept(T t)
   Consumer<String>  consumer=(p1)->{System.out.println(p1);};
   consumer.accept("Cyber Success");

   
   //Function is an functional interface inside java.util.Function package
   //Function interface provides one method called
   // T apply(T t)
   Function<Integer, String> func=(p1)->{ return "The number is"+ (++p1); };
	 String s=  func.apply(5);
   System.out.println(s);
   
   
   //Supplier is a functional interface inside the java.util.Function package
   //Supplier interface provides one abstract method called,
   // T get()
   
   
   Supplier<Integer> supplier=()->{ return 100; };
   
   System.out.println(supplier.get());
   }
   
   
   
  
  
	}


