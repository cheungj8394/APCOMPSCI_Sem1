public class GMC implements Location
{
	private double x, y;
	
	public GMC()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public GMC(double xg, double yg)
	{
		this.x = xg;
		this.y = yg;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	
	public void move(double xm, double ym)
	{
		this.x += xm;
		this.y += ym;
	}
	
	public double [] getLoc()
	{
		double[] Loc = new double[2];
		Loc[0] = x;
		Loc[1] = y;
		return Loc;
	}
}