public class Lab_02_Concatenation
{
	public static void main(String [] args)
	{
		String name, address, city, state, zipCode;
		name = "Jonathan Mi";
		address = "123 Home Street";
		city = "San Diego";
		state = "CA";
		zipCode = "92130";
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(city + ", " + state + " " + zipCode);
	}
}