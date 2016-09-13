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
		String stuf=keyboard.next();
		System.out.println(stuf+"? Wow you have no life you loser.");
		
		System.out.println("What kind of music do you listen to?");
		String mus=keyboard.next();
		System.out.println("Eww. Only scrubs listen to"+" "+mus+".");
		
		System.out.println("How many siblings do you have?");
		int num=keyboard.nextInt();
		System.out.println(num+"? I really hope they look better than you do.");
		
		System.out.println("What do you want to be when you grow up?");
		String car=keyboard.next();
		System.out.println("I'm pretty sure you're too stupid to be a "+car+".");
		
		System.out.println("So "+nam+", you're "+age+"...");
		System.out.println("You like to "+stuf+" and listen to "+mus+"...");
		System.out.println("Best of luck becoming a "+car+".");
		System.out.println("I'm just playing with you "+nam+" ;)");
		
	}
}