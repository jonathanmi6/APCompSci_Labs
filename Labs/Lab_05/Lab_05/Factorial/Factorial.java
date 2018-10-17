import java.util.*;

public class Factorial
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		int num;
		
		print("Please enter the number (int) to calculate the factorial of");
		num = inputScanner.nextInt();
		print("The factorial of " + num + " is " + calcFactorial(num));
		
	}
	
	public static int calcFactorial(int n)
	{
		int total = 1;
		for(int i = n; i > 0; i--)
		{
			total = total * i;
		}
		return total;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}