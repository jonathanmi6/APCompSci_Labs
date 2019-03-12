import java.util.*;

public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter Manufacturer: ");
		String manufacturer = inputScanner.nextLine();
		System.out.println("Enter Name: ");
		String name = inputScanner.nextLine();
		
		System.out.println("Entering category and price information?");
		String decision = inputScanner.nextLine();
		
		if(decision.equals("n"))
		{
			InventoryItems item1 = new InventoryItems(manufacturer, name);
			item1.printString();
		}
		else
		{
			System.out.println("Enter category");
			String category = inputScanner.nextLine();
			System.out.println("Enter price: ");
			double price = inputScanner.nextDouble();
			
			InventoryItems item1 = new InventoryItems(manufacturer, name, category, price);
			item1.printString();
		}
	}
}