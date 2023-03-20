package cyber.demos;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class User implements Comparable<User>
{
	String userName;
	String userPassword;
	public User(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + "]";
	}

	@Override
	public int compareTo(User o) {
		return (this.userName.compareTo(o.userName));
	}
	
	
	
}
class UserBO
{
	Set<User> setOfUser=new TreeSet<User>();
	public void addUser(User user)
	{
		setOfUser.add(user);
	}
	public Set<User> getUser()
	{
		return setOfUser;
	}
}

public class TestSet3 {

	public static void main(String[] args) {

   UserBO bo=new UserBO();
   Scanner scanner=new Scanner(System.in);
   for(int i=0; i<3; i++)
   {
	   System.out.println("Enter user name");
	   String userName=scanner.next();
	   
	   System.out.println("Enter user password");
	   String userPassword=scanner.next();
	   User userObject=new User(userName,userPassword);
	  bo.addUser(userObject);
	   
	   
   }
   
   Set<User> users=bo.getUser();
   for(User u:users)
   {
	   System.out.println(u);
   }
   
		
		

	}

}
