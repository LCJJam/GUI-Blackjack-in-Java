package driver;

import java.awt.Dialog;
import java.util.ListIterator;

import deck.Card;
import gui.BlackJackGUI;

/**
 * @author Jonathan Ho
 * This is where the program starts. This driver will take care
 * of the game logic and run it to the end of play.
 */
public class BlackJackDriver 
{
	// Handles beginning of the round
	private static void beginRound(ListIterator<Card> deckIterator,
								   CardHand playerHand,
								   CardHand dealerHand)
	{
		// logic
	}
	
	// Handles the end of the round
	private static void endRound(CardHand playerHand, CardHand dealerHand,
							     int bankroll, int bet)
	{
		if(palyerHand.handValue() == dealerHand.handValue())
			// push
		else if(playerHand.handValue() > dealerHand.handValue())
			// player win
		else
			// player lose
			
		// print current bankroll
	}
	
	// Program driven from here
	public static void main(String[] args)
	{
		new BlackJackGUI();
	}
}

