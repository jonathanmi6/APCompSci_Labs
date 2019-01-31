import java.util.*;

public class BiggestNumber
{
	static int[] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		print("For the following numbers: ");
		printArray();
		println("");
		println(getMax() + " is the biggest number");
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
	
	public static int getMax()
	{
		int max = 0;
		for(int number : numbers)
		{
			if(number > max)
			{
				max = number;
			}
		}
		return max;
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