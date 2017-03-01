public class StudentAdvance extends Advance
{	
	public StudentAdvance(int d)
	{
		super(d);
	}
	
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: "+getSerialNo() +"\nPrice: $"+getPrice()+"\n(STUDENT ID REQUIRED)\n";
	}
}