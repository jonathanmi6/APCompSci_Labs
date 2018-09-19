import java.util.*;

public class Interest
{
	public static void main (String[]args)
	{
		double rate, principal, number, time, payment;
		Scanner inputScanner = new Scanner(System.in);
		
		print("Please enter the interest rate in percent.");
		rate = inputScanner.nextDouble() / 100;
		print("Please enter the principal amount.");
		principal = inputScanner.nextDouble();
		print("Please enter the life time of the load in years.");
		time = inputScanner.nextDouble();
		print("Please enter the number of times the load is compounded per year");
		number = inputScanner.nextDouble();
		
		
		payment = calcBill(rate,principal,number,time);
		System.out.print("The total payment will be: ");
		printDollars(payment);
		
	}
	
	public static double calcBill(double rate, double principal, double number, double time)
	{
		double payment;
		payment = principal * Math.pow(1 + (rate / number), number * time);
		return payment;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
	
	public static void printDollars(double input)
	{
		System.out.printf("$%.2f", input);
		System.out.println();
	}
}