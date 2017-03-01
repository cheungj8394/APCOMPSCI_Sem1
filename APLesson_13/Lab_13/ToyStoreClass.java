import java.util.Arrays;
import java.util.ArrayList;

public class ToyStoreClass
{
	private ArrayList <ToyClass> toyList=new ArrayList<>();
	
	public ToyStoreClass()
	{
		toyList = null;
	}
	
	public ToyStoreClass(String ts)
	{
		loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		for(int i=0; i<toys.size(); i+=2)
		{
			String name=toys.get(i);
			String type=toys.get(i+1);
			ToyClass t=getThatToy(name);
			if (t == null)
			{
				if (type.equals("Car"))
				{
					toyList.add(new CarClass(name));
				}
				if (type.equals("AF"))
				{
					toyList.add(new AFigureClass(name));
				}
			}
			else
				t.setCount(t.getCount() + 1);
		}
	}
	
	public ToyClass getThatToy(String nm)
	{
		for(ToyClass i:toyList)
		{
			if(i.getName().equals(nm))
				return i;
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name="";
		int max=Integer.MIN_VALUE;
		for(ToyClass i:toyList)
		{
			if(max<i.getCount())
			{	
				max = i.getCount();
				name = i.getName();
			}
				
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars=0;
		int figures=0;
		for(ToyClass i:toyList)
		{
			if (i.getType().equals("Car"))
			{
				cars += 1;
			}
			if (i.getType().equals("AF"))
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
		return ""+toyList;
	}
}