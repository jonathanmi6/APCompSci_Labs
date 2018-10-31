import java.util.*;

public class AverageDigits
{
	public static double sum;
	
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		print("Please enter an integer");
		int number = inputScanner.nextInt();
		
		print("The average of the digits in " + number + " is " + averageDigits(number));
	}
	
	public static double averageDigits(int num)
	{
		double digits = 0;
		int sum = 0;
		while(num > 0)
		{
			digits++;
			sum = sum + num % 10;
			num = (int)num / 10;
		}
		return sum/digits;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}