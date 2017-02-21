public class StudentAdvance extends Advance
{	
	public StudentAdvance(int d)
	{
		super(d);
	}
	
	public int getSerialNo()
	{
		return super.getSerialNo();
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: "+getSerialNo() +"\nPrice: "+getPrice()+"/n(STUDENT ID REQUIRED)";
	}
}