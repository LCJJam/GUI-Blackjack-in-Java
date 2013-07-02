package manager;

import java.util.ListIterator;
import deck.Card;
import deck.CardHand;

/**
 * @author Jonathan Ho
 * This class will have methods and variables pertaining to a dealer
 * in a Blackjack game. Thees methods/variables will be used in
 * the driver class.
 */
public class DealerManager 
{
	private static Card temp = null;
	
	// Returns value of card dealt
	@SuppressWarnings("unused")
	private static Card dealCard(ListIterator<Card> deckIterator)
	{
		temp = deckIterator.next();
		//display card
		return temp;
	}
	
	private static boolean dealerTurn(ListIterator<Card> deckIterator,
									  CardHand dealerHand)
	{
		return false;
		// dealer logic
	}
}
