import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("which type of paint?");
		String paint = kb.nextLine();
		System.out.println("what type of interior?");
		String interior = kb.nextLine();
		System.out.println("power of your engine?");
		String engine = kb.nextLine();
		System.out.println("size of tires?");
		String tires = kb.nextLine();
		
		CarClass object = new CarClass(paint, interior, engine, tires);
		System.out.println("Your vehicle is ready...");
		System.out.println("Paint: "+object.getPaint());
		System.out.println("Interior: "+object.getInterior());
		System.out.println("Engine: "+object.getEngine());
		System.out.println("Tires: "+object.getTires());
	}
}