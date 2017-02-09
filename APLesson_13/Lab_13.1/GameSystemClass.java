public class GameSystemClass
{
	private String platform;
	private int serialNo;
	
	public GameSystemClass()
	{
		this.platform=p;
		this.serialNo=(int)(Math.random()*10000000)+1;
	}
	
	public GameSystemClass(String p)
	{
		this.platfrom=p;
		this.serialNo=(int)(Math.random()*10000000)+1;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	