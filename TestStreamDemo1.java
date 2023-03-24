package cyber.demos.functionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamDemo1 {

	public static void main(String[] args) {

   List<Integer> marks=new ArrayList();
   marks.add(10);

   marks.add(30);
   marks.add(34);
   marks.add(56);
   marks.add(32);
   marks.add(25);
		//iterating a list using forEach function
  // marks.forEach(m->System.out.println(m));
   //creating a stream object
 //Stream<Integer> streamOfObject=   marks.stream();
 //I want to filer student who got more than 35;
 //Predicate<Integer> p=(n)->n>=35;
// marks.stream().filter(p).forEach(m->System.out.println(m));
 //I want to add grace marks for student who got more than 30 and less than 35
  List<Integer> listOfMarks=  marks.stream().filter(m->m>=30 && m<=35).map(m->m+5).collect(Collectors.toList());
	//streamOfObject.forEach(m->System.out.println(m));	
		//listOfMarks.forEach(m->System.out.println(m));
		
		
		//marks.stream().sorted().forEach(n->System.out.println(n));
		//I want to maximum marks of student
		Comparator<Integer> cmp=(m1,m2)->m1>m2?1:-1;
	System.out.println(marks.stream().min(cmp).get());
	
int c=(int)	 marks.stream().filter(m->m<35).count();
System.out.println(c);	
	
	
		
		
		
		
		
		

	}

}
