import java.util.*;

public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		print("Please enter a word");
		String word = inputScanner.nextLine();
		
		printTree(word, 0, word.length());
	}
	
	public static void printTree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			print(word.substring(0, start));
			start++;
			printTree(word, start, stop);
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}