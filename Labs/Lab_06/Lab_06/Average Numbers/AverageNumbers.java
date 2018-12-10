import java.util.*;

public class AverageNumbers
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int num : numbers)
		{
			print(num + " ");
		}
		
		print("");
		
		print("The average of the above numbers is: " + average(numbers));
	}
	
	public static double average(int[] nums)
	{
		double total = 0;
		for(int i = 0; i < nums.length; i++)
		{
			total = total + nums[i];
		}
		return total/nums.length;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}