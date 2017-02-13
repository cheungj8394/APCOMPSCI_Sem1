import java.util.Arrays;
import java.util.ArrayList;
public class ToyStoreClass
{
	private static ArrayList <ToyClass> toyList=new ArrayList<ToyClass>();
	
	public ToyStoreClass()
	{

	}
	
	public ToyStoreClass(String l)
	{
		loadToys(l);
	}
	
	public static void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		for(int i=0; i<toys.size(); i++)
		{
			String name=toys.get(i);
			String type=toys.get(i+1);
			ToyClass nextToyClass=getThatToy(name);
			if (getThatToy(name) == null)
			{
				if (type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if (type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
				nextToyClass.setCount(nextToyClass.getCount() + 1);
		}
	}
	
	public static ToyClass getThatToy(String nm)
	{
		for(ToyClass nextToy:toyList)
		{
			if(nextToyClass.getName().equals(nm))
				return nextToyClass;
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name="";
		int max=Integer.MIN_VALUE;
		for(ToyClass nextToyClass:toyList)
		{
			if(max<nextToyClass.getCount())
			{	
				max = nextToyClass.getCount();
				name = nextToyClass.getName();
			}
				
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars=0;
		int figures=0;
		for(ToyClass nextToy:toyList)
		{
			if (nextToyClass.getType().equals("Car"))
			{
				cars += 1;
			}
			if (nextToyClass.getType().equals("AF"))
			{
				figures += 1;
			}
		}
		
		if(cars>figures)
			return "Cars";
		if(figures>cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return toyList;
	}
}