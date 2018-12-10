import java.util.*;

public class FirstLetter
{
	
	
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		String[] words = new String[5];
		
		print("Please enter 5 words");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = inputScanner.nextLine();
		}
		
		print(words);
	}
	
	public static void print(String[] words)
	{
		for(int i = 0; i < words.length; i++)
		{
			print(words[i].substring(0,1));
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}