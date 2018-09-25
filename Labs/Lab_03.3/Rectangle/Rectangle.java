import java.util.*;
public class Rectangle
{
	public static void main(String[]args)
	{
		double length, width, perimeter;

		Scanner inputScanner = new Scanner(System.in);

		print("Please input the length");
		length = inputScanner.nextDouble();
		print("Please input the width");
		width = inputScanner.nextDouble();

		print("The perimeter of this rectangle is " + calcPerimeter(length, width));

	}

	public static double calcPerimeter(double l, double w)
	{
		double perimeter;
		perimeter = 2 * l + 2 * w;
		return perimeter;
	}

	public static void print(String input)
	{
		System.out.println(input);
	}
}