import java.util.*;

public class XsAndOs
{
	static String[][] xAndO;
	static Scanner inputScanner;
	public static void main(String[]args)
	{
		xAndO = new String[4][4];
		inputScanner = new Scanner(System.in);
		
		fillArray();

	}

	public static void fillArray()
	{
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				int r = (int)(Math.random() * 2 + 1);
				if(r == 1)
				{
					xAndO[i][j] = "X";
				}
				else if(r == 2)
				{
					xAndO[i][j] = "O";
				}
				System.out.print(xAndO[i][j] + "	");
			}
			
			print("");
		}
	}
	
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}