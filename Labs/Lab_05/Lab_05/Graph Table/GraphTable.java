import java.util.*;

public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		int intInput, tableSize;
		
		print("Please enter the integer to be iterated");
		intInput = inputScanner.nextInt();
		inputScanner.nextLine();
		print("Please enter the size of the table");
		tableSize = inputScanner.nextInt();
		
		printTable(intInput, tableSize);
	}
	
	public static void printTable(int num, int size)
	{
		int result;
		print("in |out");
		print("___|___");
		for(int i = 1; i < size; ++i)
		{
			result = i * num;
			printLine(i, result);
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
	
	public static void printLine(int r1, int r2)
	{
		System.out.printf("%d  |  %d", r1, r2);
		System.out.println();
	}
}