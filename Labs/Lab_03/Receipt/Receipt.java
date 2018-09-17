import java.util.*;

public class Receipt
{
	public static String itemOne, itemTwo, itemThree;
	public static double priceOne, priceTwo, priceThree, subTotal, tax, total;
	
	public static void main(String []args)
	{
		
		print("Welcome to checkout! Due to technical difficulties, you can only buy 3 items at a time.");
		
		cashierPrompts();
		
		subTotal = priceOne + priceTwo + priceThree;
		tax = subTotal * 0.0725;
		total = subTotal + tax;
		
		printReceipt();
		
	}
	
	public static void cashierPrompts()
	{
		Scanner inputScanner = new Scanner(System.in);
		print("Please enter item 1: ");
		itemOne = inputScanner.nextLine();
		print("Please enter the price: ");
		priceOne = inputScanner.nextDouble();
		inputScanner.nextLine();
		
		print("Please enter item 2: ");
		itemTwo = inputScanner.nextLine();
		print("Please enter the price: ");
		priceTwo = inputScanner.nextDouble();
		inputScanner.nextLine();
		
		print("Please enter item 3: ");
		itemThree = inputScanner.nextLine();
		print("Please enter the price: ");
		priceThree = inputScanner.nextDouble();
	}
	
	public static void printReceipt()
	{
		print("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		print("");
		print("");
		printReceiptLine(itemOne, priceOne);
		printReceiptLine(itemTwo, priceTwo);
		printReceiptLine(itemThree, priceThree);
		print("");
		print("");
		printReceiptLine("Subtotal: ", subTotal);
		printReceiptLine("Tax: ", tax);
		printReceiptLine("Total: ", total);
		print("");
		print("__________________________________________");
		print("* Thank you for your support *");
	}

	
	public static void printReceiptLine(String string, double price)
	{
		String dollarPrice = String.format("$%.2f", price);
		System.out.printf("* %-15s ...... %15s", string, dollarPrice);
		System.out.println();
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}