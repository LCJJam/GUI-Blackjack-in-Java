package gui;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Jonathan Ho
 * A class that contains the GUI components of
 * the game and defines methods for use in the 
 * driver class.
 */
public class BlackJackGUI extends JFrame
{
	// Make new game button in File... like other windows app the dropdown
	// spinner like thing in Android
	// save new game button for later, most likely won't be a button
	// refer to notes: using JMenu, JMenuBar, JMenuItem
	private JButton hitButton, standButton, betButton, newGameButton;
	private JTextArea gameTextArea;	/* Text info about game */
	private JScrollPane scrollPane;	/* Scrolling pane */
	private JLabel visualDisplay;	/* Display cards here */
	private JPanel buttonContainer;	/* To hold JButtons */
	
	/* 
	 * When this class becomes instantiated the default
	 * constructor needs to initialize components that are necessary
	 * for this game to work.
	 */
	public BlackJackGUI()
	{
		this.setTitle("Jon's Awesome Casino!!");
		this.setSize(700, 640);
		this.setDefaultCloseOperation(BlackJackGUI.EXIT_ON_CLOSE);

		// Create area to display cards
		this.visualDisplay = new JLabel();
		
		// Create text area
		this.gameTextArea = new JTextArea(0, 20);
		
		// Put text area as the viewport for scroll pane
		this.scrollPane = new JScrollPane(this.gameTextArea);
		
		// Creating buttons
		this.hitButton = new JButton("Hit");
		this.standButton = new JButton("Stand");
		this.betButton = new JButton("Bet");
		
		/* COMMENT OUT
		// Register action listeners
		this.hitButton.addActionListener(new HitButtonListener());
		this.standButton.addActionListener(new StandButtonListener());
		this.betButton.addActionListener(new BetButtonListener());
		*/
		
		// Create JPanel
		this.buttonContainer = new JPanel(new GridLayout(0, 3));
		
		// Add buttons to JPanel
		this.buttonContainer.add(this.hitButton);
		this.buttonContainer.add(this.standButton);
		this.buttonContainer.add(this.betButton);
		
		// Add JComponents to this JFrame
		this.add(this.buttonContainer, BorderLayout.SOUTH);
		this.add(this.visualDisplay, BorderLayout.CENTER);
		this.add(this.scrollPane, BorderLayout.EAST);
		
		this.setVisible(true);
	}
	
// BLOCK BELOW W/ COMMENT
	
	/* Performs action for hit button 
	private class HitButtonListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			// add logic
		}
	}
	
	 Performs action for stand button 
	private class StandButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// add logic
		}
	}
	
	 Performs action for bet button 
	private class BetButtonListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			// add logic
		}
	}*/
}