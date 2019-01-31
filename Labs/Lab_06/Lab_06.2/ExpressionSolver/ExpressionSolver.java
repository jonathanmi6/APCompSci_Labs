import java.util.*;

public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		print("Please enter an expression to solve with spaces between each character");

		String input = inputScanner.nextLine();
		
		String[] inputArray = input.split(" ");
		
		ArrayList<String> equation = new ArrayList<String> (Arrays.asList(inputArray));
		
		System.out.print(input + " is equal to " );
		System.out.println(doEquation(equation));

	}

	public static String doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				//print("is * or /");
				if(equation.get(i).equals("*"))
				{
					equation.set(i, Integer.parseInt(equation.get(i - 1)) * Integer.parseInt(equation.get(i + 1)) + "");
					//print(equation.get(i));
				}
				else
				{
					equation.set(i, Integer.parseInt(equation.get(i - 1)) / Integer.parseInt(equation.get(i + 1)) + "");
				}
				
				equation.remove(i - 1);
				equation.remove(i);				
			}
			else
			{
				//print("case else");
				i++;
			}
		}
		
		i = 0;
		
		while(i < equation.size())
		{
			if(equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if(equation.get(i).equals("+"))
				{
					equation.set(i, Integer.parseInt(equation.get(i - 1)) + Integer.parseInt(equation.get(i + 1)) + "");
				}
				else
				{
					equation.set(i, Integer.parseInt(equation.get(i - 1)) - Integer.parseInt(equation.get(i + 1)) + "");
				}
				
				equation.remove(i - 1);
				equation.remove(i);				
			}
			else
			{
				i++;
			}
		}
		
		return equation.get(0);
	}

	public static void print(String input)
	{
		System.out.println(input);
	}
}
