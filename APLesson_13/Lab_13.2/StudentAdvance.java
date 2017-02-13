public class StudentAdvance extends Advance
{
	super();
	
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int d)
	{
		super();
	}
	
	public int getSerialNo()
	{
		return super.getSerialNo();
	}
	
	public int getPrice()
	{
		if(daysLeft>=10)
			return 15.00;
		else
			return 20.00;
	}
	
	public String toString()
	{
		return "Serial #: "+serialNo+"\nPrice: "+getSerialNo()+"/n(STUDENT ID REQUIRED)";
	}
}