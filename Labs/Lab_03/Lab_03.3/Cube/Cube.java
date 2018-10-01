import java.util.*;
public class Cube
{
	public static void main(String[]args)
	{
		double side;

		Scanner inputScanner = new Scanner(System.in);

		print("Please input the side length of the cube");
		side = inputScanner.nextDouble();
		
		print("The surface area of this cube is " + calcSurfaceArea(side));

	}

	public static double calcSurfaceArea(double l)
	{
		double sA;
		sA = 6 * Math.pow(l, 2);
		return sA;
	}

	public static void print(String input)
	{
		System.out.println(input);
	}
}