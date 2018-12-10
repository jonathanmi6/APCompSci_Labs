import java.util.*;

public class ReverseWord
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
		
		print("Your words: ");
		print(words, false);
		print("");
		print("Your words in reverse: ");
		print(words, true);
	}
	
	public static void print(String[] words, boolean reverse)
	{
		if(reverse)
		{
			for(int i = words.length-1; i >= 0; i--)
			{
				print(words[i]);
			}			
		}
		else
		{
			for(int i = 0; i < words.length; i++)
			{
				print(words[i]);
			}
		}

	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}