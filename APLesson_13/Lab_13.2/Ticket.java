public abstract class Ticket
{
	private int serialNo;
	
	public Ticket()
	{
		serialNo=(int)(Math.random()*10000000);
	}
	
	public int getSerialNo()
	{
		return this.serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: $" + getPrice() + "\n";
	}
}