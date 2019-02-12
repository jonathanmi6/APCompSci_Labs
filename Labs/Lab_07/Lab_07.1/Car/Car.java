import java.util.*;

public class Car
{
	private String paint, interior, engine, tires;
	
	public Car(String paint, String interior, String engine, String tires)
	{
		this.paint = paint;
		this.interior = interior;
		this.engine = engine;
		this.tires = tires;
	}
	
	public void setCustom(String paint, String interior, String engine, String tires)
	{
		this.paint = paint;
		this.interior = interior;
		this.engine = engine;
		this.tires = tires;
	}
	
	public String getPaint()
	{
		return paint;
	}
	
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public String getTires()
	{
		return tires;
	}
}