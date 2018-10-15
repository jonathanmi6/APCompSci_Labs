import java.util.*;

public class PasswordProgram
{
	public static void main(String[]args)
	{
		String password = "password";
		String username = "username";
		checkPassword(password, username);
	}
	
	public static void checkPassword(String p, String u)
	{
		Scanner inputScanner = new Scanner(System.in);
		print("Please enter your username");
		String uAttempt = inputScanner.nextLine();
		print("Please enter your password");
		String pAttempt = inputScanner.nextLine();
		
		if(pAttempt.equals(p) && uAttempt.equals(u))
		{ 
			print("Access granted!");
		}
		else
		{
			if(!pAttempt.equals(p) && !uAttempt.equals(u))
			{
				print("Your usename and password is incorrect.");
			}
			else if(!pAttempt.equals(p))
			{
				print("Your password is incorrect.");
			}
			else if(!uAttempt.equals(u))
			{
				print("Your username is incorrect.");
			}
			checkPassword(p,u);
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}