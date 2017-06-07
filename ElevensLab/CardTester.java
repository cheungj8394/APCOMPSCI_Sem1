/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card a = new Card("2", "Hearts", 3);
		Card b = new Card("8", "Diamonds", 3);
		Card c = new Card("9", "Spade", 3);
		
		System.out.println("Does b match c?" + " " + b.matches(c));
		System.out.println("Does a match c?" + " " + a.matches(c));
		System.out.println("Card b:" + " " + b.toString());
		System.out.println("Suit of Card c: " + c.suit());
	}
}
