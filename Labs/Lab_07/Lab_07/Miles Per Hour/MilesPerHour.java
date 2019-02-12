import java.util.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(int distance, int hours, int minutes)
	{
		this.distance = distance;
		this.hours = hours;
		this.minutes = minutes;
		this.mph = 0;
	}
	
	public void setValue(int distance, int hours, int minutes)
	{
		this.distance = distance;
		this.hours = hours;
		this.minutes = minutes;
		this.mph = 0;		
	}
	
	public double getMPH()
	{
		return Math.round(distance / (hours + minutes / 60.0));
	}
}