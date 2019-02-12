import java.util.*;

public class Human
{
	private String hair, eye, skin;
	
	public Human(String hair, String eye, String skin)
	{
		this.hair = hair;
		this.eye = eye;
		this.skin = skin;
	}
	
	public void setHES(String hair, String eye, String skin)
	{
		this.hair = hair;
		this.eye = eye;
		this.skin = skin;
	}
	
	public String gethair()
	{
		return hair;
	}
	
	public String geteye()
	{
		return eye;
	}
	
	public String getskin()
	{
		return skin;
	}
}