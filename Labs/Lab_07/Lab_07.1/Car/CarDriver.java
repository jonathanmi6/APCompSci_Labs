import java.util.*;

public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter Paint: ");
		String paint = inputScanner.nextLine();
		
		System.out.println("Enter Interior: ");
		String interior = inputScanner.nextLine();
		
		System.out.println("Enter Engine: ");
		String engine = inputScanner.nextLine();
		
		System.out.println("Enter Tires: ");
		String tires = inputScanner.nextLine();
		
		Car vehicle = new Car(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready.....");
		System.out.println("Paint: " + vehicle.getPaint());
		System.out.println("Interior: " + vehicle.getInterior());
		System.out.println("Engine: " + vehicle.getEngine());
		System.out.println("Tires: " + vehicle.getTires());
	}
}