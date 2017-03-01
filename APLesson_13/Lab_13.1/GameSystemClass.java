public class GameSystemClass
{
	private String platform;
	private int serialNo;
	
	public GameSystemClass()
	{
		this.platform="";
	}
	
	public GameSystemClass(String p)
	{
		this.platform=p;
	}
	
	public String getPlatform()
	{
		return this.platform;
	}
	
	public int getSerialNo()
	{
		serialNo=(int)(Math.random()*10000000);
		return this.serialNo;
	}
}