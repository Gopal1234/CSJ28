package cyber.demos;

class Person
{
	String name;
	String address;
	long phone;
	public Person(String name, String address,long phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone=phone;
	}
	void displayPesron()
	{
		System.out.println(name +  " "+address + " "+phone);
		
	}
	
	
}
class Developer extends Person
{
	int projectId;
	String projectName;
	String projectLocation;
	public Developer(String name, String address,long phone, int projectId, String projectName, String projectLocation) {
	    // System.out.printn("Hi");
		super(name, address,phone);
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectLocation = projectLocation;
	}
	void displayDeveloper()
	{
		System.out.println(name +  " "+address + " "+phone + " "+projectId + " "+projectName+ " "+projectLocation);
		
	}
	
}
class Manager extends Developer
{
	String teamName;

	public Manager(String name, String address,long phone, int projectId, String projectName, String projectLocation,
			String teamName) {
		super(name, address, phone,projectId, projectName, projectLocation);
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Manager [teamName=" + teamName + "]";
	}
	
}

public class TestInheritanceDemo2 {
	public static void main(String[] args) {
		Manager m=new Manager("Ravi", "Pune",8147117572L, 101,"web project","Bangalore","coder");
		m.displayPesron();
		m.displayDeveloper();
		System.out.println(m);
		
	}

}
