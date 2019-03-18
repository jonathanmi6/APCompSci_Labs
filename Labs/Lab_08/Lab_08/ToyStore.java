import java.util.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();;
	
	public ToyStore()
	{
		
	}
	
	public ToyStore(String ts)
	{
		//System.out.println("Created toystore obj");
		this.loadToys(ts);
	}
	
	private void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));

		//System.out.println("created toys arraylist");
		
		for(int i = 0; i < toys.size() - 1; i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			

			Toy toy = getThatToy(name);

			
			if(toy == null)
			{
				if(type.equals("Car"))
				{
					toy = new Car(name);
					this.toyList.add(toy);
				}
				else if(type.equals("AF"))
				{
					toy = new AFigure(name);
					this.toyList.add(toy);
				}
			}
			else
			{
				toy.setCount(toy.getCount() + 1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if(t.getName().equals(nm))
				return t;
		}	
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;

		for(Toy t : toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}

		return name;
	}

	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;

		for(Toy t : this.toyList)
		{			
			//System.out.println(t);
			if(t.getType().equals("Car"))
			{
				//System.out.println("add cars");
				cars++;
			}
			else if(t.getType().equals("AF"))
			{
				//System.out.println("add af");
				figures++;
			}
			else
			{
				System.out.println(t.getType());
			}
		}

		//System.out.println(toyList);

		//System.out.println("cars: " + cars + "figs " + figures);

		if(cars > figures)
			return "Cars";
		else if(figures > cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}

	public String toString()
	{
		return toyList.toString();
	}
}