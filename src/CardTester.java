/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("4", "Hearts", 5);
		Card card2 = new Card("3", "Clubs", 7);
		Card card3 = new Card("A", "Spades", 9);

		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());

	}
}
