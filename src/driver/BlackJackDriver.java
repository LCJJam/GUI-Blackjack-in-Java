package driver;

import java.awt.Dialog;

import gui.BlackJackGUI;

public class BlackJackDriver {
	private static int bankroll;
	private static boolean tryAgain = true;
	private static Dialog endState;
	
	/* Fix these methods to work correctly later */
	
	private static void setBankroll(int bankroll)
	{
		//BlackJackGUI.bankroll = bankroll;
	}

	// Returns the bankroll the user has left.
	private static int getBankroll()
	{
		return 0;//BlackJackGUI.bankroll;
	}

	// Returns the user bet, however need to check to see if bet
	// made by player is valid. Add in these checks later.
	private static int getBet(int bet)
	{
		return bet;
	}                                                                                                                                                                                                                                                                                                                                                                                                                                   

	// Program driven from here
	public static void main(String[] args)
	{
		new BlackJackGUI();
	}
}

