import java.util.*;

public class ReverseNumber
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		print("Please enter an integer");
		int number = inputScanner.nextInt();
		
		print("The reverse of " + number + " is " + reverseNum(number));
	}
	
	public static int reverseNum(int num)
	{
		int rev = 0;
		while(num > 0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}