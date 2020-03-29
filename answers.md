1. A Card has a rank, suit, and value. A Deck has arrays of ranks, suits, and values, which can be used to create an ArrayList of Cards.

2. 6

3.  String[] ranks = {"2", ..., "10", "jack", "queen", "king", "ace"};
    String suits = {"spades", "hearts", "diamonds", "clubs"};
    int[] pointValues = {2, ..., 10, 10, 10, 10, 11};

4. Not for suits, but for ranks and pointValues, since each rank is associated with a specific point value