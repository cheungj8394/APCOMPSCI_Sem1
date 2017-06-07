/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"King", "Ace", "Queen"};
		String[] suits1 = {"Hearts", "Diamonds", "Clubs"};
		int[] pointValues1 = {13, 1, 12};
		Deck deck1 = new Deck(ranks1, suits1, pointValues1);
		System.out.println("The first deck should be empty: " + deck1.isEmpty());
		
		String[] ranks2 = {"10", "8", "Jack"};
		String[] suits2 = {"Diamonds", "Diamonds", "Hearts"};
		int[] pointValues2 = {10, 8, 11};
		Deck deck2 = new Deck(ranks2, suits2, pointValues2);
		System.out.println("The second deck's size should be: " + deck2.size());
		
		String[] ranks3 = {"7", "4", "King"};
		String[] suits3 = {"Spades", "Clubs", "Hearts"};
		int[] pointValues3 = {7, 4, 13};
		Deck deck3 = new Deck(ranks3, suits3, pointValues3);
		System.out.println("The third deck's dealt card is: " + deck3.deal());
		
		String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
		int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck deck = new Deck(ranks, suits, pointValues);
		//System.out.println(d);
		System.out.println("The whole deck's dealt card is: " + deck.deal());
	}
}
