public abstract class Toy
{
	private String name;
	private int count;
	
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	
	public Toy(String name)
	{
		this.name = name;
		this.count = 1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return "[" + this.name + "] [" + this.count + "]";
	}
}