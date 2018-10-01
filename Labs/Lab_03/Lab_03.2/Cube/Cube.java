import java.util.*;

public class Cube
{
	public static void main(String[]args)
	{
		double side, surfaceArea;

		Scanner inputScanner = new Scanner(System.in);

		print("Please input the side length of the cube");
		side = inputScanner.nextDouble();
		
		surfaceArea = 6 * Math.pow(side, 2);

		print("The surface area of this cube is " + surfaceArea);
	}

	public static void print(String input)
	{
		System.out.println(input);
	}
}