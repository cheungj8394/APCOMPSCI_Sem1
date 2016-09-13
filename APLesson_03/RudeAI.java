import java.util.Scanner;//import Statement
public class RudeAI
{
	public static void main(String[]args)
	{
		System.out.println("Hi, my name is RudeAI.");
		System.out.println("I'd like to ask you a few questions.");
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("What is your name?");
		String nam=keyboard.next();
		System.out.println(nam+"!? What kind of name is"+" "+nam+"? I would never want that to be my name!" );
		
		System.out.println("How old are you, "+nam+"?");
		int age=keyboard.nextInt();
		System.out.println("Whoa there, dinosaur. "+age+"?!! You're ancient!");
		
		System.out.println("What do you do for fun, "+ nam+"?");
		String stuf=keyboard.nextLine();
		System.out.println(stuf+"? Wow you have no life you loser.");
	}
}