public class ToyRunnerClass extends ToyClass
{
	public void main(String[]args)
	{
		ToyRunnerClass AFigure= new ToyRunnerClass("starwars");
		ToyRunnerClass Car=new ToyRunnerClass("hotwheels");
		
		System.out.println(Car.toString());
		System.out.println(Afigure.toString());
	}
	
	public String getType()
	{
		return "";
	}

}