import java.util.Scanner;
public class ID_Card
{
	public static void main(String[]args)
	{
	ID_Card form= new ID_Card();
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
	form.format(School,Year);
	form.format(First,Last);
	form.format(job,sub);
	System.out.format("\n%38s","**************************************");
	}
	
	public void format(String word1, String word2)
	{
		System.out.printf("*12s\t%20s*\n",word1, word2);
	}
	
	
}
