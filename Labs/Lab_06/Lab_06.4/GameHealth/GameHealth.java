import java.util.*;

public class GameHealth
{
	static String[] health;
	
	static final int HEALTH_LOAD = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTH_LOAD];
		
		while(!turn.equals("Q") && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = inputScanner.nextLine();
			damage = (int)(Math.random() * 2 + 1);
			amount = (int)(Math.random() * 6 + 1);
			
			takeDamage(damage, amount);
			printClip();
		}
		
		System.out.println("You died.");
		
	}
	
	public static void takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthCount = healthCount - amt;
			System.out.println("Taking " + amt + " damage!");
		}
		else 
		{
			if (healthCount + amt < HEALTH_LOAD)
			{
				healthCount = healthCount + amt;
			}
			else
			{
				healthCount = HEALTH_LOAD;
			}
			
			System.out.println("Power up " + amt + " !");
		}
	}
	
	public static void printClip()
	{
		String output = "Health:	";
		for(int i = 0; i < HEALTH_LOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
			}
			
			output = output + health[i];
		}
		
		System.out.println(output);
	}
	
}