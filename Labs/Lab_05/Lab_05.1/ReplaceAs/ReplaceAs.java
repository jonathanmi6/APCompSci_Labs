import java.util.*;

public class ReplaceAs
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		print("Please enter a sentence");
		String sentence = inputScanner.nextLine();
		
		print(replaceA(sentence));
	}
	
	public static String replaceA(String sent)
	{
		while(sent.indexOf("a") >= 0)
		{
			sent = sent.substring(0, sent.indexOf("a")) + "@" + sent.substring(sent.indexOf("a") + 1, sent.length());
		}
		return sent;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}