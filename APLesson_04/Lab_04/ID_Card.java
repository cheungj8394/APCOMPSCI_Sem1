import java.util.Scanner;
public class ID_Card
{
	public static void main(String[]args)
	{
	System.out.println("Enter your first name:");
	Scanner keyboard=new Scanner(System.in);
	String First=keyboard.next();
	
	System.out.println("Enter your last name:");
	String Last=keyboard.next();
	
	System.out.println("Enter your title:");
	String job=keyboard.next();
	keyboard.nextLine();
	
	System.out.println("Enter the school site:");
	String School=keyboard.nextLine();
	
	System.out.println("Enter the school year:");
	String Year=keyboard.nextLine();
	
	System.out.println("What is your subject?");
	String sub=keyboard.nextLine();

	System.out.println("\n");
	System.out.format("\n%38s","**************************************");
	System.out.format("\n* %12s  %20s *",School,Year);
	System.out.format("\n* %12s	%20s *",First,Last);
	System.out.format("\n* %12s	%20s *",job,sub);
	System.out.format("\n%38s","**************************************");
	
	
	}
}