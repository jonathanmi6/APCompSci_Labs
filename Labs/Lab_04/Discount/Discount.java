import java.util.*;

public class Discount
{
	public static String itemOne, itemTwo, itemThree, itemFour;
	public static double priceOne, priceTwo, priceThree, priceFour, subTotal, tax, total, discount;
	
	public static void main(String []args)
	{
		
		print("Welcome to checkout! There is a limited off of a 15% discount if you spend at least $2000!");
		
		cashierPrompts();
		
		subTotal = priceOne + priceTwo + priceThree + priceFour;
		discount = checkDiscount(subTotal);
		tax = (subTotal - discount) * 0.0725;
		total = subTotal - discount + tax;
		
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
		inputScanner.nextLine();
		
		print("Please enter item 4: ");
		itemFour = inputScanner.nextLine();
		print("Please enter the price: ");
		priceFour = inputScanner.nextDouble();
	}
	
	public static void printReceipt()
	{
		print("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		print("");
		printReceiptLine(itemOne, priceOne);
		printReceiptLine(itemTwo, priceTwo);
		printReceiptLine(itemThree, priceThree);
		printReceiptLine(itemFour, priceFour);
		print("");
		print("");
		printReceiptLine("Subtotal: ", subTotal);
		printReceiptLine("Discount: ", discount);
		printReceiptLine("Tax: ", tax);
		printReceiptLine("Total: ", total);
		print("__________________________________________");
		print("     * Thank you for your support *");
	}
	
	public static double checkDiscount(double input)
	{
		double output;
		
		if(input >= 2000)
		{
			output = input * 0.15;
		}
		else
		{
			output = 0;
		}
		
		return output;
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