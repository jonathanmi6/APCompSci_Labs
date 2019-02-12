import java.util.*;

public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		this.xOne = xOne;
		this.yOne = yOne;
		this.xTwo = xTwo;
		this.yTwo = yTwo;
		this.distance = 0;
	}
	
	public void setValues(int xOne, int yOne, int xTwo, int yTwo)
	{
		this.xOne = xOne;
		this.yOne = yOne;
		this.xTwo = xTwo;
		this.yTwo = yTwo;
		this.distance = 0;		
	}
	
	public double getDistance()
	{
		return Math.sqrt((xTwo-xOne) * (xTwo-xOne) + (yTwo-yOne) * (yTwo-yOne));
	}
}