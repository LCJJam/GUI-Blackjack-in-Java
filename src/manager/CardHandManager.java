package manager;

import java.util.ArrayList;
import java.util.List;

import deck.Card;

/**
 * @author Jonathan Ho
 * This class will be used to implement the factory pattern to return
 * a CardHand object. 
 */
public class CardHandManager 
{
	@SuppressWarnings("unused")
	private static CardHand cardHandFactory()
	{
		return new CardHand();
	}
	
	/**
	 * @author Jonathan Ho
	 * A class to represent a hand of cards. It can be for a dealer or player.
	 */
	private static class CardHand
	{
		List<Card> cardHand = new ArrayList<Card>();
		private int value = 0;

		/* Instantiating this class means a new hand is dealt */
		public CardHand()
		{
			this.value = 0;
		}

		/*
		 * Adds a new card to the end of the list, it automatically resizes
		 * itself to accommodate for more elements (ArrayList property).
		 * The card hand value is also updated.
		 */
		@SuppressWarnings("unused")
		public void add(Card newCard)
		{
			cardHand.add(newCard);
			this.value += newCard.rank().getValue();
		}

		/* Returns the removed card from the hand at the specified index.
		 * Subtracts the value from the overall hand. Although that's
		 * kind of pointless and totally unnecessary in blackjack
		 * since you can't remove a card anyways... uh...
		 * in future updates may want to create separate acessors
		 * and mutators anyways... just a thought.
		 */
		@SuppressWarnings("unused")
		public Card remove(int index)
		{
			this.value -= cardHand.get(index).rank().getValue();
			return cardHand.remove(index);
		}

		/*
		 * Returns the size of the ArrayList
		 * In this case it returns how many cards there are.
		 */
		@SuppressWarnings("unused")
		public int size()
		{
			return cardHand.size();
		}

		/* Returns the total value of the hand */
		@SuppressWarnings("unused")
		public int handValue()
		{
			return this.value;
		}
	}
}
