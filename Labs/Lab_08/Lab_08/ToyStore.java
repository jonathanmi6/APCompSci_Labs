import java.util.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		
	}
	
	public ToyStore(ArrayList<Toy> toyList)
	{
		this.toyList = toyList;
		loadToys(toyList);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new Arraylist<String>(ts.split(", "));
		
		for(int i = 0; i < toys.size() + 1; i++)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1):
			
			Toy toy = new Toy(getThatToy(name));
			
			if(getThatToy(name) = null)
				Toy toy = new Toy(getThatToy(name));
			else
				toy.setCount(toy.getCount + 1);
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if(t.getName == nm)
				return t;
			else
				return null;
		}	
	}
	
	public String getMostFrequentToy()
	{
		String name;
		int max;
		for(int i = 0; i < toys.size() + 1; i++)
		{
			if(max < i)
			{
				max = i;
				name toys.get(i);
			}
		}
	}
}