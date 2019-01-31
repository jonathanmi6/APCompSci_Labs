import java.util.*;

public class KeepComposites
{
	static Integer[] numbers;
	static ArrayList<Integer> numList;
	
	public static void main(String[]args)
	{
		numbers = new Integer[] {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		numList = new ArrayList<Integer> (Arrays.asList(numbers));

		System.out.println(numList);	
		
		removePrimes();
		
		System.out.println(numList);
	}
	
	public static boolean gFactor(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if(n%i == 0)
			{
				return false; //prime
			}
		}
		return true;
	}
	
	public static void removePrimes()
	{
		for(int i = 0; i < numList.size(); i++)
		{
			if(gFactor(numList.get(i)))
			{
				numList.remove(i);
				i--;
			}
		}
	}
}