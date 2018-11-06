import java.util.*;

public class Underscores
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		print("Please enter a sentence");
		String sentence = inputScanner.nextLine();
		
		print(replaceSpaces(sentence));
	}
	
	public static String replaceSpaces(String sent)
	{
		if(sent.indexOf(" ") <= 0)
		{
			return sent;
		}
		else
		{
			return replaceSpaces(sent.substring(0, sent.indexOf(" ")) + "_" + sent.substring(sent.indexOf(" ") + 1, sent.length())); 
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}