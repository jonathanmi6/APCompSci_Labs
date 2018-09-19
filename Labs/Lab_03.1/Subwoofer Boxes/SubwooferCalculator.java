import java.util.*;

public class SubwooferCalculator
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		double height, length, width, volume;
		
		print("Please enter the height in inches");
		height = inputScanner.nextDouble();
		print("Please enter the length in inches");
		length = inputScanner.nextDouble();
		print("Please enter the width in inches");
		width = inputScanner.nextDouble();
		
		volume = volumeCalculator(height, length, width);
		
		System.out.print("The volume in feet is: ");
		printVolume(volume);
		
	}
	
	public static double volumeCalculator(double height, double length, double width)
	{
		double volume, heightFT, lengthFT, widthFT;
		heightFT = height/12;
		lengthFT = length/12;
		widthFT = width/12;
		
		volume = heightFT * lengthFT * widthFT;
		
		return volume;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
	
	public static void printVolume(double volume)
	{
		System.out.printf("%.2fft", volume);
		System.out.println();
	}
}