import java.util.Scanner;

public class RudeAI
{
	public static void main(String []args)
	{
		//init
		Scanner inputScanner = new Scanner(System.in); 
		String name, age, forFun, musicGenre, siblings, dreamJob;
		print("Hi, my name is RudeAi");
		print("I'd like to ask you a few questions");
		//name
		print("What is your name?");
		name = inputScanner.nextLine();
		print(name + "?!!! What kind of name is that??");
		//age
		print("How old are you " + name);
		age = inputScanner.nextLine();
		print(age + "? I've wonder what it was like to grow up with the dinosaurs, maybe you can help now that I know your age.");
		//forFun
		print("Maybe you have something you do for fun " + name + " ?");
		forFun = inputScanner.nextLine();
		print(forFun + "? You call that fun???");
		//musicGenre
		print("Hmmm, what kind of music do you listen to?");
		musicGenre = inputScanner.nextLine();
		print(musicGenre + " hmmm? Not suprising that you have bad taste in music aswell considering that you are " + age + " , and that you like to " + forFun + " for \"fun\".");
		//siblings
		print("How many siblings do you have?");
		siblings = inputScanner.nextLine();
		print("Good god, there's " + siblings + " more of you?? I feel so sorry for your parents.");
		//dreamJob
		print("I wonder what your dream job would be, considering that you do " + forFun + " for fun.");
		dreamJob = inputScanner.nextLine();
		print("Uhhhh.... I think you need to actually be smart to be a " + dreamJob + ".");
		//conclusion
		print("So " + name + ", it looks like you are " + age + ".");
		print("You like to " + forFun + " \"for fun\" and listen to " + musicGenre + ", and you want to become a " + dreamJob + ".");
		print("Sounds like you live an awful life.");
		print("just kidding ;)");
	}
	
	public static void print(String input)
	{
		System.out.println(input);
	}
}