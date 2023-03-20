package cyber.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
	List<Integer> listOfMarks;

	public List<Integer> getListOfMarks() {
		return listOfMarks;
	}

	public void setListOfMarks(List<Integer> listOfMarks) {
		this.listOfMarks = listOfMarks;
	}
	
	public List<Integer> sortMarks()
	{
		Collections.sort(listOfMarks);
		return listOfMarks;
	}
	
	public int getMaxMarks()
	{
		
		return Collections.max(listOfMarks);
	}
	public ArrayList<Integer> addGraceMarks()
	{
		ArrayList<Integer> al=new ArrayList();
		for(int i=0; i<listOfMarks.size(); i++)
		{
			if(listOfMarks.get(i)<35 && listOfMarks.get(i)>=30)
			{
				al.add(listOfMarks.get(i)+5);
			}
		}
		return al;
	}
	
}



public class TestCollection1 {

	public static void main(String[] args) {
		Student student=new Student();
		List<Integer> list=new ArrayList();
		list.add(10);
		list.add(50);
		list.add(32);
		list.add(78);
		list.add(1);
		student.setListOfMarks(list);
		System.out.println(student.getMaxMarks());
		System.out.println(student.addGraceMarks());
		System.out.println(student.sortMarks());

	}

}
