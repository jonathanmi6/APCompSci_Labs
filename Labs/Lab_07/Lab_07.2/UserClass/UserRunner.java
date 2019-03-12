import java.util.*;

public class UserRunner
{
	public static String avatar;
	
	public static void main(String[]args)
	{
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter a first name");
		String firstName = inputScanner.nextLine();
		System.out.println("Enter a last name");
		String lastName = inputScanner.nextLine();
		System.out.println("Avatar? Enter Yes or No");
		String decision = inputScanner.nextLine();
		
		if(decision.equals("Yes"))
		{
			System.out.println("Enter an avatar");
			avatar = inputScanner.nextLine();
			User newUser = new User(firstName, lastName, avatar);
			newUser.printString();
		}
		else
		{
			User newUser = new User(firstName, lastName);
			newUser.printString();
		}
		
	}
}