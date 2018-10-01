import java.util.*;

public class Circle
{
	public static void main(String[]args)
	{
		double radius, area;

		Scanner inputScanner = new Scanner(System.in);

		print("Please input the radius of the circle");
		radius = inputScanner.nextDouble();
		
		area = Math.PI * Math.pow(radius, 2);

		print("The area of this circle is " + area);
	}

	public static void print(String input)
	{
		System.out.println(input);
	}
}