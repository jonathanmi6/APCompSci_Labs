import java.util.*;

public class Receipt
{
	public static void main(String []args)
	{
		getInput();
		printReceipt("test", 2);
	}
	
	public static void getInput()
	{
		Scanner inputScanner = new Scanner(System.in);
	}
	
	public static void printReceipt(String string, double price)
	{
		System.out.printf("%12s %10.2f", string, price);
		System.out.println();
	}
}