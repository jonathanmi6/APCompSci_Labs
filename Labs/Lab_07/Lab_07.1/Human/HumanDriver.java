import java.util.*;

public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter hair: ");
		String hair = inputScanner.nextLine();
		
		System.out.println("Enter eye color: ");
		String eye = inputScanner.nextLine();
		
		System.out.println("Enter skin color: ");
		String skin = inputScanner.nextLine();
		
		Human person = new Human(hair, eye, skin);
		
		System.out.println("Human information.....");
		System.out.println("Hair: " + person.gethair());
		System.out.println("Eyes: " + person.geteye());
		System.out.println("Skin: " + person.getskin());
		
		System.out.println("Enter friend hair: ");
		hair = inputScanner.nextLine();
		
		System.out.println("Enter friend eye color: ");
		eye = inputScanner.nextLine();
		
		System.out.println("Enter friend skin color: ");
		skin = inputScanner.nextLine();
		
		person.setHES(hair, eye, skin);
		
		System.out.println("Friend information.....");
		System.out.println("Hair: " + person.gethair());
		System.out.println("Eyes: " + person.geteye());
		System.out.println("Skin: " + person.getskin());
	}
}