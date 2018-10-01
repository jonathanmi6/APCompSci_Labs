import java.util.*;

public class Average
{
	public static void main(String[]args)
	{
		double num1, num2, num3;

		Scanner inputScanner = new Scanner(System.in);

		print("This program will calculate the average of 3 numbers.");
		print("Please enter number 1: ");
		num1 = inputScanner.nextDouble();
		print("Please enter number 2: ");
		num2 = inputScanner.nextDouble();
		print("Please enter number 3: ");
		num3 = inputScanner.nextDouble();

		print("The average of " + num1 + " and " + num2 + " and " + num3 + " is: " + calcAvg(num1, num2, num3));
		
	}

	public static double calcAvg(double num1, double num2, double num3)
	{
		double avg;
		avg = (num1 + num2 + num3)/3;
		return avg;
	}

	public static void print(String input)
	{
		System.out.println(input);
	}
}