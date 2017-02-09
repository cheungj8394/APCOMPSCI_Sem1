public abstract class ConsoleClass extends GameSystemClass
{
	super();
	
	public ConsoleClass()
	{
		super();
	}
	
	public ConsoleClass(String p)
	{
		super();
	}
	
	public String getPlatform()
	{
		return super.getPlatform();
	}
	
	public int getSerialNo()
	{
		return super.getSerialNo();
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: "+platform+"\n"+"Serial #: "+serialNo+"\n"+"Controller: "+controller;
	}
	
}