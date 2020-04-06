1. It's an instance variable, not a method

2. cards is an array that only holds Cards, not methods

3. isLegal and anotherPlayIsPossible could still be called polymorphically with the interface design, but all of the methods that are inherited by ElevensBoard are not overridden couldn't work the same way with the interface design, so the abstract class design is better.