import java.util.Scanner;
public class AdventureGame
{
	public static int choiceNum;
	
	public static void main(String[]args)
	{
		print("You are an simple adventurer on the road hoping to come across some riches and kick some ass.");
		runGame();
	}
	
	public static void runGame()
	{	
		print("You come upon a fork in a road, do you go left or right traveler?");
		gameDecision("left", "right");
		if(choiceNum == 1)
		{
			print("You continue down the left path and see a man in need of help fighting a monster, do you help him?");
			gameDecision("yes", "no");
			if(choiceNum == 1)
			{
				print("You help the man slay the monster and he is incredibly greatful.");
				print("As a token of appreciation, he gives you some gold.");
				print("Seeing as you are the only two people on the path, he asks if he may join your on your journey.");
				print("Do you allow him to accompany you?");
				gameDecision("yes", "no");
				if(choiceNum == 1)
				{
					print("You are greatful for his company and the two of you continue on your journey");
					print("The two of you head into a swamp and hear someone, or something, shout \"WHAT ARE YOU DOING IN MY SWAMP?\"");
					print("The two of you try to run away, but the ogre grabs your leg.");
					print("However, your new friend is able to pull you up and the two of you slay the ogre.");
					print("As you go to look at the ogre's house, you head some faint music coming from his shack \"Hey now, you're an all star...\"");
					print("Play again?");
					gameDecision("yes", "no");					
					if(choiceNum == 1)
					{
						runGame();
					}					
				}
				else
				{
					print("You decline his offer and continue on your way.");
					print("As you wade into the swamp ahead, you hear someone, or something, shout \"WHAT ARE YOU DOING IN MY SWAMP?\"");
					print("You try to run away, but the ogre grabs your leg and pulls you under the water, drowning you.");
					print("Play again?");
					gameDecision("yes", "no");
					if(choiceNum == 1)
					{
						runGame();
					}
				}
			}
			else
			{
				print("Not wanting to get into a complication with a monster, you sneak away from the monster and the man.");
				print("You continue on your way and come across a thief and he takes some of your gold. Do you fight him?");
				gameDecision("yes", "no");
				if(choiceNum == 1)
				{
					print("Seeing you pull out your sword, he grabs his dagger and stabs you.");
					print("Do you dodge left or right?");
					gameDecision("left", "right");
					if(choiceNum == 1)
					{
						print("You successfully dodge his attack and slay the thief.");
						print("You loot his body and continue on your journey.");
						print("Play again?");
						gameDecision("yes", "no");
						if(choiceNum == 1)
						{
							runGame();
						}
					}
					else
					{
						print("You dodge into his attack and he stabs you to death.");
						print("Play again?");
						gameDecision("yes", "no");
						if(choiceNum == 1)
						{
							runGame();
						}
					}
				}
				else
				{
					print("Not wanting to start a fight, you let the thief go.");
					print("Play again?");
					gameDecision("yes", "no");
					if(choiceNum == 1)
					{
						runGame();
					}
				}
			}
		}
		else
		{
			print("You continue down the right path and come across a cave, do you enter?");
			gameDecision("yes", "no");
			if(choiceNum == 1)
			{
				print("You enter the cave and come across a dragon guarding his treasure.");
				print("Do you try to take some gold?");
				gameDecision("yes", "no");
				if(choiceNum == 1)
				{
					print("He notices you take his gold and fries you to a crisp.");
					print("Play again?");
					gameDecision("yes", "no");
					if(choiceNum == 1)
					{
						runGame();
					}
				}
				else
				{
					print("You leave the dragon alone and continue deeper into the cave and come upon an unguarded treasure chest.");
					print("Play again?");
					gameDecision("yes", "no");
					if(choiceNum == 1)
					{
						runGame();
					}
				}
			}
			else
			{
				print("You don't enter the cave and instead continue down the right path.");
				print("You notice it is getting late and there is an inn nearby, do you stay there for the night?");
				gameDecision("yes", "no");
				if(choiceNum == 1)
				{
					print("You stay the night at the inn and you are refreshed for the new day.");
					print("Play again?");
					gameDecision("yes", "no");
					if(choiceNum == 1)
					{
						runGame();
					}
				}
				else
				{
					print("You decide to continue into the night.");
					print("However, a group of skeleton pirates ambushes you and you are killed.");
					print("Play again?");
					gameDecision("yes", "no");
					if(choiceNum == 1)
					{
						runGame();
					}
				}
			}
		}
		print("Finish");
	}
	
	public static void gameDecision(String a, String b)
	{
		Scanner scn = new Scanner(System.in);
		String choice = scn.nextLine();
		if(choice.equals(a))
		{
			choiceNum = 1;
			//print("You have chosen " + a);
		}
		else if(choice.equals(b))
		{
			choiceNum = 2;
			//print("You have chosen " + b);
		}
		else
		{
			print("Please enter either " + a + " or " + b);
			gameDecision(a, b);
		}
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}