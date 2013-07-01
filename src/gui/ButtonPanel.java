package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel 
{
	private JButton hitButton, standButton, betButton;

	/* Get empty JPanel object then fill it with the buttons */
	public ButtonPanel()
	{
		super(new GridLayout(0, 3));
		hitButton = new JButton("Hit");
		standButton = new JButton("Stand");
		betButton = new JButton("Bet");

		this.addActionListeners();
		this.fillPanel();
	}

	/* Add action listeners for each button */
	private void addActionListeners()
	{
		// Register action listeners
		this.hitButton.addActionListener(new HitButtonListener());
		this.standButton.addActionListener(new StandButtonListener());
		this.betButton.addActionListener(new BetButtonListener());
	}

	/* Add buttons to the panel */
	private void fillPanel()
	{
		this.add(this.hitButton);
		this.add(this.standButton);
		this.add(this.betButton);
	}

	/* Performs action for hit button */ 
	private class HitButtonListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			// add logic
		}
	}

	/* Performs action for stand button */ 
	private class StandButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// add logic
		}
	}

	/* Performs action for bet button */ 
	private class BetButtonListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			// add logic
		}
	}
}
