import java.util.*;

public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter xOne: ");
		int xOne = inputScanner.nextInt();

		System.out.println("Enter yOne: ");
		int yOne = inputScanner.nextInt();	
		
		System.out.println("Enter xTwo: ");
		int xTwo = inputScanner.nextInt();
		
		System.out.println("Enter yTwo: ");
		int yTwo = inputScanner.nextInt();

		Distance dist = new Distance(xOne, yOne, xTwo, yTwo);

		System.out.println("Distance from (" + xOne + ", " + yOne + ") to (" + xTwo + ", " + yTwo + ") is " + dist.getDistance());
		
		System.out.println("Enter xOne: ");
		xOne = inputScanner.nextInt();

		System.out.println("Enter yOne: ");
		yOne = inputScanner.nextInt();	
		
		System.out.println("Enter xTwo: ");
		xTwo = inputScanner.nextInt();
		
		System.out.println("Enter yTwo: ");
		yTwo = inputScanner.nextInt();

		dist.setValues(xOne, yOne, xTwo, yTwo);

		System.out.println("Distance from (" + xOne + ", " + yOne + ") to (" + xTwo + ", " + yTwo + ") is " + dist.getDistance());
	}
}