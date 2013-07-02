package gui;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Jonathan Ho
 * This class will be called with new and be used as JScrollPane
 * that contains a JTextArea as its view port.
 * Just a nice little way to take away variable declaration code
 * away from the main gui class.
 */
@SuppressWarnings("serial")
public class GameText extends JScrollPane 
{
	private final static JTextArea JTA = new JTextArea(0, 20);
	
	/* Default constructor calls overloaded constructor */
	public GameText()
	{
		this(JTA);
	}
	
	/* Get an object back with JTextArea as its view port */
	public GameText(JTextArea jta)
	{
		super(jta);
	}
}
