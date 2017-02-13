public class Advance extends Ticket
{
	super();
	private int daysLeft;
	
	public Advance()
	{
		super();
		daysLeft=d;
	}
	
	public Advance(int d)
	{
		ticket=t;
		serialNo=s;
		daysLeft=d;
	}
	
	public int getSerialNo()
	{
		return super.getSerialNo();
	}
	
	public int getPrice()
	{
		if(daysLeft>=10)
			return 30.00;
		else
			return 40.00;
	}
	
	public String toString()
	{
		return super.toString();
	}
}