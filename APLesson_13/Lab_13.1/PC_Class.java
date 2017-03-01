public class PC_Class extends GameSystemClass
{
	
	public String getPlatform()
	{
		return "PC";
	}

	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: "+getPlatform()+"\nSerial #: "+getSerialNo()+"\nSystem Input: "+systemInput();
	}
	
}