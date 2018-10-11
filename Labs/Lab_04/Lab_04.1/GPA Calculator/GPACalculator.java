import java.util.*;

public class GPACalculator
{
	public static void main(String[]args)
	{
		String math, physics, compSci, english, econ, psych, drawing;
		double gpa;
		Scanner inputScanner = new Scanner(System.in);
		
		print("Enter your letter grade for math");
		math = inputScanner.nextLine();
		print("Enter your letter grade for physics");
		physics = inputScanner.nextLine();
		print("Enter your letter grade for computer science");
		compSci = inputScanner.nextLine();
		print("Enter your letter grade for english");
		english = inputScanner.nextLine();
		print("Enter your letter grade for economics");
		econ = inputScanner.nextLine();
		print("Enter your letter grade for psychology");
		psych = inputScanner.nextLine();
		print("Enter your letter grade for drawing");
		drawing = inputScanner.nextLine();
		
		gpa = (calcPointGrade(math) + calcPointGrade(physics) + calcPointGrade(compSci) + calcPointGrade(english) + calcPointGrade(econ) + calcPointGrade(psych) + calcPointGrade(drawing))/7; 
		
		System.out.printf("Your GPA is %.2f", gpa);
	}
	
	public static double calcPointGrade(String lGrade)
	{
		double gradePoint;
		if(lGrade.charAt(0) == 'A' || lGrade.charAt(0) == 'a')
		{
			gradePoint = 4.0;
		}
		else if(lGrade.charAt(0) == 'B' || lGrade.charAt(0) == 'b')
		{
			gradePoint = 3.0;
		}
		else if(lGrade.charAt(0) == 'C' || lGrade.charAt(0) == 'c')
		{
			gradePoint = 2.0;
		}
		else if(lGrade.charAt(0) == 'D' || lGrade.charAt(0) == 'd')
		{
			gradePoint = 1.0;
		}
		else if(lGrade.charAt(0) == 'F' || lGrade.charAt(0) == 'f')
		{
			gradePoint = 0.0;
		}
		else
		{
			gradePoint = -10;
		}
		return gradePoint;
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}