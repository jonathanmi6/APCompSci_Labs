import java.util.*;

public class DiceRoll
{
	public static void main(String[]args)
	{
		int playerRoll, computerRoll;
		String winner;
		Random rng = new Random();
		
		playerRoll = rng.nextInt(6) + 1;
		computerRoll = rng.nextInt(6) + 1;
		
		winner = compareDice(playerRoll, computerRoll);
		
		print("You rolled a " + playerRoll);
		print("The computer rolled a " + computerRoll);
		print("The winner is " + winner);
		
	}
	
	public static String compareDice(double player, double computer)
	{
		if(player > computer)
		{
			return "you!";
		}
		else if(player < computer)
		{
			return "the computer.";
		}
		else
		{
			return "no one!";
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}