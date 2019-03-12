public class User
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	public User()
	{
		firstName = null;
		lastName = null;
		avatar = null;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.avatar = null;
		this.userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String firstName, String lastName, String avatar)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.avatar = avatar;
		this.userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setAvatar(String avatar)
	{
		this.avatar = avatar;
	}
	
	public void printString()
	{
		System.out.println("Customer Info...\nFirst Name: " + firstName +
							   "\nLast Name: " + lastName +
							   "\nAvatar: " + avatar +
							   "\nUser ID#: " + userID);
	}
}