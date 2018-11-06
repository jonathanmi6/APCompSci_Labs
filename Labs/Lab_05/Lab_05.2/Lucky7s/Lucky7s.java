import java.util.*;

public class Lucky7s
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		print("Please enter an integer");
		int number = inputScanner.nextInt();
		
		print("There are " + countSevens(number) + " 7's in " + number);
	}
	
	public static int countSevens(int num)
	{
		if(num > 0)
		{
			if(num % 10 == 7)
			{
				return 1 + countSevens(num/10);
			}
			else
			{
				return countSevens(num/10);
			}
		}
		else
		{
			return 0;
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}