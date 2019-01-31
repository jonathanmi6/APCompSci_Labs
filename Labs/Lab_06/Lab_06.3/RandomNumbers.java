import java.util.*;

public class RandomNumbers
{
	static int[][] nums;
	public static void main(String[]args)
	{
		nums = new int[4][4];
		
		fillArray();
		
		printArray();

	}

	public static void fillArray()
	{
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random() * 100 + 1);
			}			
		}
	}
	
	public static void printArray()
	{
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}