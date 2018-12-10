import java.util.*;

public class FibonacciSequence
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		print("Enter sequence start position");
		int startPos = inputScanner.nextInt();
		
		print("Enter sequence length");
		int length = inputScanner.nextInt();
		
		int[] sequence = new int[length];
		
		for(int i = 0; i < length; i++)
		{
			if(i == 0 || i == 1)
			{
				sequence[i] = startPos;
			}
			else
			{
				sequence[i] = sequence[i-1] + sequence[i-2];
			}
			
			print(sequence[i] + " ");
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}