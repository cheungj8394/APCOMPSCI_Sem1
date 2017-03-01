public class TicketDriver
{
	public static void main(String[]args)
	{
		Advance adv = new Advance(20);
		StudentAdvance sAdv = new StudentAdvance(17);
		Walkup walk = new Walkup();
		
		System.out.println(adv);
		System.out.println(sAdv);
		System.out.println(walk);
	}
}

