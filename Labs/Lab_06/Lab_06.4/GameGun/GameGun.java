import java.util.*;

public class GameGun
{
	static int bulletCount, shotCount;
	static final int CLIP_SIZE = 16;
	static String[] clip;
	
	public static void main(String[]args)
	{
		clip = new String[CLIP_SIZE];
		Scanner inputScanner = new Scanner(System.in);
		
		bulletCount = 96;
		shotCount = 0;
		
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: (R is reload, S is shoot)");
			String action = inputScanner.nextLine();
			if(action.equals("R") || action.equals("r"))
			{
				reload();
			}
			else if(action.equals("S") || action.equals("s"))
			{
				shoot();
			}
			
			printClip();
		}
		
		System.out.println("Out of Bullets!!!");
	}
	
	public static void resetClip()
	{
		for(int i = 0; i < CLIP_SIZE; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static void shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			System.out.println("Boom!!!");
		}
		else
		{
			System.out.println("Reload!!!");
		}
		
	}
	
	public static void reload()
	{
		if(bulletCount >= CLIP_SIZE)
		{
			bulletCount = bulletCount - CLIP_SIZE;
			shotCount = CLIP_SIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = "*";
		}
	}
	
	public static void printClip()
	{
		String output = "Bullets:	" + bulletCount + "\nClip:	";
		
		for(int i = 0; i < CLIP_SIZE; i++)
		{
			output = output + clip[i];
		}
		
		System.out.println(output);
	}
	
}