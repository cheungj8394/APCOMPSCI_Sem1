public abstract class Ticket
{
	private String ticket;
	private int serialNo;
	
	public Ticket()
	{
		this.ticket="";
		this.serialNo=0;
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random()*10000000);
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: "+serialNo+"\nPrice: "+getSerialNo();
	}
}