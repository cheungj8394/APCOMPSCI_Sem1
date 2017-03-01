public abstract class ConsoleClass extends GameSystemClass
{
	
	public abstract String getController();
	
	public ConsoleClass()
	{
		super();
	}
	
	public ConsoleClass(String p)
	{
		super(p);
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerialNo() + "\nController: " + getController();
	}
	
}