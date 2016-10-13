import java.util.Random;
public class DiceRoll
{
	public static void main(String[]args)
	{
		Random rand=new Random();
		int playerRoll=rand.nextInt(6)+1;
		int compRoll=rand.nextInt(6)+1;
		System.out.println("You rolled a "+playerRoll);
		System.out.println("The computer rolled a "+compRoll);
		rollDice(playerRoll, compRoll);
		
	}
	public static void rollDice(int playerRoll,int compRoll)
	{
		if(playerRoll>compRoll)
		{
			System.out.println("The winner is you.");
		}
	
		if(compRoll>playerRoll)
		{
			System.out.println("The winner is the computer.");
		}
	}
	 
}