import java.util.ArrayList;
public class ToyStoreClass
{
	private ArrayList <ToyClass> toyList;
	
	public static void main(String[]args)
	{
		toyList = new ArrayList<ToyClass>();
	}
	
	public ToyStoreClass()
	{
		loadToys(toyList);
	}
	
	public ToyStoreClass(ArrayList <ToyClass> toyList)
	{
		loadToys(toyList);
	}
	
	public void loadToys(ArrayList <> ts)
	{
		ts.split(", ")="toys";
		for(int i=0; i<toys.size(); i++)
		{
			String name=toys[i];
			String type=toys[i+1];
			
			
			
		}
	}
	
	public void getThatToy(String nm)
	{
		for(toy:toyList)
			if(name==nm)
				return toy;
		return null;
	}
	
	public void getMostFrequentToy()
	{
		String name="";
		int max=Integer.min_value;
		for(toy:toyList)
		{
			if(max<=count)
				return name;
			if(name==toy)
				return name;
		}
	}
	
	public void getMostFrequentType()
	{
		int cars=0;
		int figures=0;
		for(toy:toyList)
		{
			if(type==Car)
				cars+=1;
			if(type==AF)
				figures+=1;
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