import java.util.*;

public class Box
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		String sInput;
		
		print("Input string.");
		sInput = inputScanner.nextLine();
		printBox(sInput);
	}
	
	public static void printBox(String s)
	{
		double sLength = s.length();
		
		for(int i = 0; i < sLength; ++i)
		{
			print(s);
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}