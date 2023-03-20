package cyber.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student1
{
	List<Integer> marks;

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	
	public List<Integer> sortMarks()
	{
		Collections.sort(marks);
		return marks;
	}
	
	public ArrayList<Integer> addGraceMarks()
	{
		ArrayList<Integer> al=new ArrayList();
		
		for(int i=0; i<marks.size(); i++)
		{
			if(marks.get(i)>=30 && marks.get(i)<35)
			{
				int newMarks=marks.get(i)+5;
				al.add(newMarks);
			}
		}
		return al;
		
		
		
	}
	
	public int getMaxMarks()
	{
		return Collections.max(marks);
	}
	
	
}




public class TestListDemo1 {
	
	public static void main(String[] args) {
		Student1 studObj=new Student1();
	List<Integer>  listOfMarks=new ArrayList();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter marks");
		for(int i=0; i<5; i++)
		{
		int m=scanner.nextInt();
		listOfMarks.add(m);
		}
		
		studObj.setMarks(listOfMarks);
		
		System.out.println("without sorting*************");
List<Integer> list1=		studObj.getMarks();
  for(int n:list1)
  {
	  System.out.println(n);
  }
  System.out.println("after sorting*************")	;
  List<Integer> list2=		studObj.sortMarks();
  for(int n:list2)
  {
	  System.out.println(n);
  }
  
  System.out.println("after adding marks*************")	;
  List<Integer> list3=		studObj.addGraceMarks();
  for(int n:list3)
  {
	  System.out.println(n);
  }
	
  System.out.println("max marks is"+" "+studObj.getMaxMarks());
	}

}
