public abstract class Car3 implements Location3
{
	public final int ID = (int)(Math.random()*1000000)+999999;
	private double[] location;
	
	public Car3()
	{
		location= new double[2];
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}