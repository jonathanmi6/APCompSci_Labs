import java.util.*;

public class BMI_Calculator
{
	public static void main(String []args)
	{
		Scanner inputScanner = new Scanner(System.in);
		Double heightInInches, weightInLbs, BMI;
		
		print("This is a BMI calculator!");
		print("Please enter your weight in pounds.");
		weightInLbs = inputScanner.nextDouble();
		print("Please enter your height in inches.");
		heightInInches = inputScanner.nextDouble();
		BMI = calculateBMI(heightInInches, weightInLbs);
		print("Your BMI is: " + BMI);
	}
	
	public static double calculateBMI(double height, double weight)
	{
		double BMI;
		BMI = weight / (Math.pow(height, 2)) * 703;
		return BMI;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}