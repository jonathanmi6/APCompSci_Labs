import java.util.*;

public class DigitAdder
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		print("Please enter an integer");
		int number = inputScanner.nextInt();
		
		print("The sum of the digits in " + number + " is " + sumDigits(number));
	}
	
	public static int sumDigits(int num)
	{
		int sum = 0;
		while(num > 0)
		{
			sum = sum + num % 10;
			num = (int)num / 10;
		}
		return sum;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}