// Java program to create a user-defined
// package and function to print
// a message for the users
package UserPack;

// Class
public class UserPackClass {

	public void show()
	{
		System.out.println("Hello everyone!! How are you?");
	}

	public static void main(String args[])
	{
		UserPackClass obj = new UserPackClass();
		obj.show();
	}
}
