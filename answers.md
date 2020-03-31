1. A deck, 9 places for face-up cards, and a discard pile. Instance variables: an array of 9 cards, a deck

2. 9 cards are dealt from the deck. 2- and 3-pairs are removed and discarded, and immediately replaced by dealing more cards from the deck into the vacated spots. No more cards are dealt after the deck runs out of cards.

3. I believe so!

4. a. In ElevensBoard() and in NewGame(), which are respectively called at the beginning of the first game and each subsequent game

b. anotherPlayIsPossible(), isLegal()

c.  0   1   2   3   4   5   6   7   8
    JH  6C  2S  AS  4H

d. public static printCards(ElevensBoard board){
		List<Integer> cIndexes = board.cardIndexes();
		Card card;
		for (int k = 0; k < cIndexes.length; k++){
			card = cIndexes.get(k);
			System.out.println(card.toString());
		}
	}

e. anotherPlayIsPossible(), because it needs to look at all face-up cards, whereas isLegal() only looks at selected cards