import java.util.*;

public class FindZs
{
	static String[] words;
	
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		print("For the following words: ");
		printArray();
		println("");
		println(hasZs() + "have the letter z");
	}
	
	public static void fillArray()
	{
		Scanner inputScanner = new Scanner(System.in);
		for(int i = 0; i < words.length; i++)
		{
			println("Please enter word " + (i + 1));
			words[i] = inputScanner.nextLine();
		}
	}
	
	public static void printArray()
	{
		for(String word : words)
		{
			print(word + " ");
		}
	}
	
	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs = zs + word + " ";
			}
		}
		return zs;
	}
	
	public static void print(String input)
	{
		System.out.print(input);
	}
	
	public static void println(String input)
	{
		System.out.println(input);
	}
}