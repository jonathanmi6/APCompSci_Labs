import java.util.*;

public class GetOdds
{
	static int[] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		print("For the following numbers: ");
		printArray();
		println("");
		println(getOdds() + "are the odd numbers");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100 + 1);
		}
	}
	
	public static void printArray()
	{
		for(int number : numbers)
		{
			print(number + " ");
		}
	}
	
	public static String getOdds()
	{
		String odds = "";
		for(int number : numbers)
		{
			if(!(number % 2 == 0))
			{
				odds = odds + number + " ";
			}
		}
		return odds;
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