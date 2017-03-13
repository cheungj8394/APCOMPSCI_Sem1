public class Honda implements Location
{
	private double[] Location = new double[2];
	public Honda()
	{
		Location[0] = 0;
		Location[1] = 1;
	}
	public Honda(double[] loc)
	{
		Location[0] = loc[0];
		Location[1] = loc[1];
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	
	public void move(double xm, double ym)
	{
		Location[0] += xm;
		Location[1] += ym;
	}
	
	public double [] getLoc()
	{
		return Location;
	}
}