import java.util.*;

public class Center
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		print("Please enter a word");
		String word1 = inputScanner.nextLine();
		print("Please enter a word");
		String word2 = inputScanner.nextLine();
		print("Please enter a word");
		String word3 = inputScanner.nextLine();
		
		print(centerWord(word1));
		print(centerWord(word2));
		print(centerWord(word3));
		
	}
	
	public static String centerWord(String s)
	{
		if(s.length() >= 20)
		{
			return s;
		}
		else
		{
			return centerWord(" " + s + " ");
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}