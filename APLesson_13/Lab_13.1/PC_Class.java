public class PC_Class extends GameSystemClass
{
	super();
	
	public PC_Class()
	{
		super();
	}
	
	public PC_Class(String p)
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
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: "+platform+"\n"
		+"Serial #: "+serialNo+"\n"+"System Input: "+controller;
	}