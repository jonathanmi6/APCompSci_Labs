import java.util.*;

public class Divisor
{
	static int[][] nums;
	public static void main(String[]args)
	{
		nums = new int[4][4];
		Scanner inputScanner = new Scanner(System.in);
		
		fillPrintArray();
		
		print("Please enter a number.");
		int divisor = inputScanner.nextInt();
		
		divide(divisor);
	}

	public static void fillPrintArray()
	{
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random() * 100 + 1);
				System.out.print(nums[i][j] + " ");
			}

			print("");
		}
	}
	
	public static void divide(int div)
	{
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % div == 0)
				{
					count++;
				}
			}
		}
		
		print("There are " + count + " numbers divisible by " + div + " in the Array.");
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}