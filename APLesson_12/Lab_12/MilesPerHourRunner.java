import java.util.Scanner;
public class MilesPerHourRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Distance:");
		int distance = kb.nextInt();
		System.out.println("How many hours:");
		int hours = kb.nextInt();
		System.out.println("How many minutes:");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		System.out.println(object.getDistance()+" miles in "+object.getHours()+" hours"+" = "+object.getMPH()+" mph");
		
		object.setValues(1, 2, 3);
		System.out.println(object.getDistance()+" miles in "+object.getHours() +" hours"+" = "+object.getMPH()+" mph");
	}
}