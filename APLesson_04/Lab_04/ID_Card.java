import java.util.Scanner; 

public class ID_Card
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		ID_Card form = new ID_Card();
		
		System.out.println("Enter your first name:");
		String first = kb.nextLine();
		
		System.out.println("Enter your last name:");
		String last = kb.nextLine();
		
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		
		System.out.println("Enter the school site:");
		String site = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		
		System.out.println("What is your subject?");
		String subject = kb.nextLine();

		System.out.println("*******************************************");
		form.format(site, year);
		form.format(first, last);
		form.format(title, subject);
		System.out.println("*******************************************");
	}
		public void format(String word, String word2)
	{
		System.out.printf("*%10s\t\t\t%15s*\n", word, word2);		
	}
}