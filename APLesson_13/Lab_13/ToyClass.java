public abstract class ToyClass
{
	private String name;
	private int count;
	
	public ToyClass()
	{
		this.count=1;
		this.name="";
	}
	
	public ToyClass(String n, int c)
	{
		this.name=n;
		this.count=c=1;
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
	
	public String toString(String n, int c)
	{
		return "["+name+"]"+"["+count+"]"+"\n";
	}
	
}