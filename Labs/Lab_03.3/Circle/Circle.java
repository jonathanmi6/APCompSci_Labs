import java.util.*;

public class Circle
{
	public static void main(String[]args)
	{
		double radius;

		Scanner inputScanner = new Scanner(System.in);

		print("Please input the radius of the circle");
		radius = inputScanner.nextDouble();

		print("The area of this circle is " + calcArea(radius));
	}

	public static double calcArea(double r)
	{
		double area;
		area = Math.PI * Math.pow(r, 2);
		return area;
	}

	public static void print(String input)
	{
		System.out.println(input);
	}
}