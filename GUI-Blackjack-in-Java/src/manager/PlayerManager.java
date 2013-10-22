package manager;

import java.util.ListIterator;

/**
 * @author Jonathan Ho
 * This class will have methods and variables pertaining to a player
 * in a Blackjack game. These methods/variables will be used
 * in the driver class.
 */
public class PlayerManager 
{
	private static int bankroll;
	private static String choice;
	
	private static boolean playerTurn(ListIterator<Card> deckIterator,
									  CardHand playerHand)
	{
		// logic
		// need to access CardHand
	}
	
	private static int getBet(int bankroll)
	{
		int bet;
		// loop logic
		return bet;
	}
	
	private static boolean keepOnGoing(int bankroll)
	{
		if(bankroll == 0)
		{
			// end game
		}
		else
		{
			System.out.println("stuff");
			// ask if want to continue
		}
		return false;
	}
	
	private static void setBankroll(int bankroll) 
	{ 
		PlayerManager.bankroll = bankroll; 
	}
	
	private static int getBankroll() { return bankroll; }
}
