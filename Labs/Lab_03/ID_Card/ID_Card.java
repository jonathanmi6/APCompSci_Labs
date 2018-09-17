import java.util.*;

public class ID_Card
{
	public static String fullName, lastName, jobTitle, schoolLocation, schoolYear, subject;
	public static void main(String[]args)
	{
		print("Welcome to ID Card generator!");
		infoRequest();
		printIDCard();
	}
	
	public static void infoRequest()
	{
		Scanner inputScanner = new Scanner(System.in);
		print("Enter your full name: ");
		fullName = inputScanner.nextLine();
		print("Enter your job title: ");
		jobTitle = inputScanner.nextLine();
		print("Enter your school location: ");
		schoolLocation = inputScanner.nextLine();
		print("Enter the school year: ");
		schoolYear = inputScanner.nextLine();
		print("Enter your subject: ");
		subject = inputScanner.nextLine();
	}

	public static void printIDCard()
	{
		print("*************************************");
		printInfoLine(schoolLocation, schoolYear);
		printInfoLine(fullName, "");
		printInfoLine(jobTitle, subject);
		print("*************************************");
	}
	
	public static void printInfoLine(String columnOne, String columnTwo)
	{
		System.out.printf("*%-18s", columnOne);
		System.out.printf("%-17s*", columnTwo);
		System.out.println();
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}