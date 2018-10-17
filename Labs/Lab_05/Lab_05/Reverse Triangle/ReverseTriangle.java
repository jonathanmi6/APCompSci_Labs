import java.util.*;

public class ReverseTriangle
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		String word;
		
		print("Please enter a string");
		word = inputScanner.nextLine();
		printTriangle(word);
	}
	
	public static void printTriangle(String s)
	{
		int length = s.length();
		
		for(int i = length; i > 0; i--)
		{
			print(s.substring(0 , i));
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}