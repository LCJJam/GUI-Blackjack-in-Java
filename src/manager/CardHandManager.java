package manager;

import java.util.ArrayList;
import java.util.List;
import deck.Card;
import deck.CardHand;

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
}
