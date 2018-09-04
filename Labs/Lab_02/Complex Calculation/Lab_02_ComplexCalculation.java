public class Lab_02_ComplexCalculation
{
	public static void main(String [] args)
	{
		double length, height, width, surfaceArea;
		length = 2;
		height = 4;
		width = 5;
		surfaceArea = length * width * 2 + length * height * 2 + width * height * 2;
		System.out.println("The surface area of a " + length + " by " + width + " by " + height + " rectangular prism is: " + surfaceArea);
	}
}