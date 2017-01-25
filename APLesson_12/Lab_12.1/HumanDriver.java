import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("hair color?");
		String hair = kb.next();
		System.out.println("eye color?");
		String eyes = kb.next();
		System.out.println("skin type/color?");
		String skin = kb.next();
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("My info...");
		System.out.println("Hair: "+object.getHair());
		System.out.println("Eyes: "+object.getEyes());
		System.out.println("Skin: "+object.getSkin());
		
		object.setHES("black","brown","tan");
		System.out.println("Friend's info...");
		System.out.println("Hair: "+object.getHair());
		System.out.println("Eyes: "+object.getEyes());
		System.out.println("Skin: "+object.getSkin());
	}
}