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
		
		perimeter = 2 * length + 2 * width;

		print("The perimeter of this rectangle is " + perimeter);

	}

	public static void print(String input)
	{
		System.out.println(input);
	}
}