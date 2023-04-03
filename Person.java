package cyber.pack1;

public class Person {
	String personName;
	String personAddress;
	
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String personName, String personAddress) {
		super();
		this.personName = personName;
		this.personAddress = personAddress;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAddress=" + personAddress + "]";
	}
	

}
