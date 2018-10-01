import java.util.*;

public class VolumeCalculator
{
	public static void main (String []args)
	{
		//init
		Scanner inputScanner = new Scanner(System.in);
		double radius, height, volume;
		print("This calculator calculates the volume of a cylinder.");
		print("Please make sure to enter all values with the same units, but don't include that unti in the input");
		//prompt
		print("Please enter the radius.");
		radius = inputScanner.nextDouble();
		print("Please enter the height.");
		height = inputScanner.nextDouble();
		//calculate
		volume = cylinderCalculator(radius, height);
		//print answer
		print("The volume of a cylinder with radius " + radius + " and height " + height + " is " + volume);
		
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}	
	
	public static double cylinderCalculator(double r, double h)
	{
		double V;
		V = Math.PI * Math.pow(r, 2) * h;
		return V;
	}
}
