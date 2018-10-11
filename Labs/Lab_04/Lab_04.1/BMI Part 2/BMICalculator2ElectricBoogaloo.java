import java.util.*;

public class BMICalculator2ElectricBoogaloo
{
	public static void main(String []args)
	{
		Scanner inputScanner = new Scanner(System.in);
		Double heightInInches, weightInLbs, BMI;
		String condition;
		
		print("This is a BMI calculator!");
		print("Please enter your weight in pounds.");
		weightInLbs = inputScanner.nextDouble();
		print("Please enter your height in inches.");
		heightInInches = inputScanner.nextDouble();
		BMI = calculateBMI(heightInInches, weightInLbs);
		condition = calcCondition(BMI);
		System.out.printf("Your BMI is: %.2f and your physical condition is considered %s", BMI, condition);
	}
	
	public static double calculateBMI(double height, double weight)
	{
		double BMI;
		BMI = weight / (Math.pow(height, 2)) * 703;
		return BMI;
	}
	
	public static String calcCondition(double bmi)
	{
		String condition;
		if(bmi < 18.5)
		{
			condition = "Underweight";
		}
		else if(18.5 <= bmi && bmi < 25)
		{
			condition = "Normal";
		}
		else if(25 <= bmi && bmi < 30)
		{
			condition = "Overweight";
		}
		else if(30 <= bmi && bmi < 35)
		{
			condition = "Obese";
		}
		else if(35 <= bmi && bmi < 39.9)
		{
			condition = "Very Obese";
		}
		else
		{
			condition = "Morbidly Obese";
		}
		return condition;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}