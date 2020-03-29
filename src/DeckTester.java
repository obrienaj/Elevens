/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	
		String[] suits = new String[4];
		suits[0] = "diamonds";
		suits[1] = "clubs";
		suits[2] = "hearts";
		suits[3] = "spades";

		String[] ranks1 = new String[4];
		ranks1[0] = "2";
		ranks1[1] = "3";
		ranks1[2] = "4";
		ranks1[3] = "5";

		int[] values1 = new int[4];
		values1[0] = 1;
		values1[1] = 2;
		values1[2] = 3;
		values1[3] = 4;

		Deck deck1 = new Deck(ranks1, suits, values1);

		String[] ranks2 = new String[5];
		ranks2[0] = "2";
		ranks2[1] = "3";
		ranks2[2] = "4";
		ranks2[3] = "5";
		ranks2[4] = "6";

		int[] values2 = new int[5];
		values2[0] = 1;
		values2[1] = 2;
		values2[2] = 3;
		values2[3] = 4;
		values2[4] = 5;

		Deck deck2 = new Deck(ranks2, suits, values2);

		String[] ranks3 = new String[13];
		ranks3[0] = "2";
		ranks3[1] = "3";
		ranks3[2] = "4";
		ranks3[3] = "5";
		ranks3[4] = "6";
		ranks3[5] = "7";
		ranks3[6] = "8";
		ranks3[7] = "9";
		ranks3[8] = "10";
		ranks3[9] = "J";
		ranks3[10] = "Q";
		ranks3[11] = "K";
		ranks3[12] = "A";

		int[] values3 = new int[13];
		for (int i = 0; i < 13; i++){
			values3[i] = i + 1;
		}

		Deck deck3 = new Deck(ranks3, suits, values3);

		System.out.println(deck1.deal().toString());
		System.out.println(deck2.deal().toString());
		System.out.println(deck3.deal().toString());
	}
}
