package deck;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jonathan Ho
 * A class that represents a playing card.
 * Make an ArrayList of Card objects to fill up a "deck".
 */
public class Card
{
	private final Suit suit;
	private final Rank rank;

	/* Enums that are easier to handle in Java */
	public enum Suit {SPADES, HEARTS, CLUBS, DIAMONDS }
	public enum Rank 
	{
		/* 
		 * For the sake of this game make it simple first by having 
		 * Ace as 11, work on making it 1 or 11 later.
		 */
		DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
		NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);
		final int value;
		Rank(int value) { this.value = value; }
		public int getValue() { return value; }
	}

	// Creates an array list of class Card, easier to handle than an array
	// This will represent the initial Deck of cards
	private static final List<Card> initDeck = new ArrayList<Card>();

	// Constructor called to fill in Deck object
	private Card(Rank rank, Suit suit)
	{
		this.suit = suit;
		this.rank = rank;
	}

	// Return string representation of card
	public String toString() { return rank + " of " + suit; }

	// getter for suit
	public Suit suit() { return this.suit; }

	// getter for rank
	public Rank rank() { return this.rank; }

	// getter for initDeck which is a List of object Card
	// that is an ArrayList of object Card
	public static List<Card> getDeck() { return initDeck; }

	/* 
	 * Initialize deck: apparently you can just make static code
	 * that will just arbitrarily run on its own
	 */
	static
	{
		// the static method values from Enum returns an array of the 
		// enums in order that is why the for-each iteration 
		// works so well here
		for (Suit suit : Suit.values())
			for (Rank rank : Rank.values())
				initDeck.add(new Card(rank, suit));
	}
}

