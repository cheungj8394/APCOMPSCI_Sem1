import java.util.Scanner;
public class Adventure
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Would you like to..."+
							"\n 1. Go to Candy Land"+
							"\n 2. Visit a Foreign place");
		int adv=kb.nextInt();
		if(adv==1)
		{
			System.out.println("Nice! You're on the way to Candy Land! Would you like some"+
								"\n a. Chocolate"+
								"\n b. Lollipop");
			String Candy=kb.next();
			if(Candy.equals("a"))
			{
				System.out.println("You scored some Chocolate! Do you want a. Dark Chocolate, or b. Milk Chocolate");
				String chocotype= kb.next();
				if(chocotype.equals("a"))
					System.out.println("Yum! Dark Chocolate is now in your tummy :)");
				else
					System.out.println("Here's some Milk Chocolate then :)");
			}
			else
			{
				System.out.println("Here's your lollipop! Do you want a. Swirly Lollipop, or b. Striped Lollipop");
				String lolType=kb.next();
				if(lolType.equals("a"))
					System.out.println("Nice! You just got a Swirly Lollipop!");
				else
					System.out.println("You can now eat your striped lollipop! Lucky you!");
			}
		}
		else
		{
			System.out.println("Nice! You're traveling abroad. Where to?"+
								"\n a. Hawaii"+
								"\n b. India");
			String place=kb.next();
			if(place.equals("a"))
			{
				System.out.println("You are going to Hawaii!! Do you want to a. Go to the beach, or b. Go snorkeling.");
				String chocotype= kb.next();
				if(chocotype.equals("a"))
					System.out.println("Don't forgot to grab some sunscreen and a towel!!");
				else
					System.out.println("Awesome! Don't forget to guy your snorkeling gear.");
			}
			else
			{
				System.out.println("India it is!! Do you want to a. Ride an elephant or b. See the Taj Mahal");
				String lolType=kb.next();
				if(lolType.equals("a"))
					System.out.println("Sure thing! Made sure you don't fall off of the elephant!");
				else
					System.out.println("Sweeeeet... take lots of pictures!!");
			}
		}
	}
}