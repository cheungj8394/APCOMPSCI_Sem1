public abstract class ToyClass
{
	private String name;
	private int count;
	
	public ToyClass()
	{
		this.count=1;
		this.name="";
	}
	
	public ToyClass(String n)
	{
		this.name=n;
		this.count=1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setName(String n)
	{
		this.name=n;
	}
	
	public void setCount(int c)
	{
		this.count=c;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return "["+name+"]"+"["+count+"]"+"\n";
	}
	
}