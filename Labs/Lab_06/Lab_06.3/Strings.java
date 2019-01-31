import java.util.*;

public class Strings
{
	static String[][] words;
	static Scanner inputScanner;
	public static void main(String[]args)
	{
		words = new String[4][4];
		inputScanner = new Scanner(System.in);
		
		fillArray();
		
		printArray();

	}

	public static void fillArray()
	{
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				print("Please enter a word: ");
				words[i][j] = inputScanner.nextLine();
			}			
		}
	}
	
	public static void printArray()
	{
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}