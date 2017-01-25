import java.util.Scanner;
public class User2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		User pH;
		System.out.println("What is your first name?");
		String first = kb.next();
		System.out.println("What is your last name?");
		String last = kb.next();
		System.out.println("Do you want a public avatar? (yes or no)");
		String avatar = kb.next();
		
		if(avatar.equals("no"))
			pH = new User(first, last);
		else
		{
			System.out.println("Please enter your avatar: ");
			avatar = kb.next();
			pH = new User(first, last, avatar);
		}
			
		System.out.println(pH);
	}
}