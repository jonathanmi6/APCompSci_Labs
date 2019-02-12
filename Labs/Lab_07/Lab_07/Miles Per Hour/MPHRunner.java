import java.util.*;

public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter Distance: ");
		int distance = inputScanner.nextInt();
		
		System.out.println("Enter Hours: ");
		int hours = inputScanner.nextInt();

		System.out.println("Enter Minutes: ");
		int minutes = inputScanner.nextInt();	

		MilesPerHour MPH = new MilesPerHour(distance, hours, minutes);

		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + MPH.getMPH() + " mph");
		
		System.out.println("Enter Distance: ");
		distance = inputScanner.nextInt();
		
		System.out.println("Enter Hours: ");
		hours = inputScanner.nextInt();

		System.out.println("Enter Minutes: ");
		minutes = inputScanner.nextInt();	
		
		MPH.setValue(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + MPH.getMPH() + " mph");
	}
}