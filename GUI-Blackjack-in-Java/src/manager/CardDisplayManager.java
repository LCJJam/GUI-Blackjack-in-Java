package manager;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.Throwable;

import javax.imageio.ImageIO;

import deck.Card.*;		/* For Suit and Rank */

public class CardDisplayManager
{
	private final static String imgPathName = new String("/img/Cards.gif");
	private final int CARDHEIGHT = 60;
	private final int CARDWIDTH = 40;
	private Suit suit;
	private Rank rank;
	private BufferedImage cardImage;
	
	/* Default constructor does nothing but call super() */
	public CardDisplayManager()
	{
		super();
	}
	
	/*
	 * Initialize variables from this constructor.
	 * @param Suit suit - The suit of the card (4 possible)
	 * @param Rank rank - The rank of the card (13 possible)
	 */
	public CardDisplayManager(Suit suit, Rank rank)
	{
		this.suit = suit;
		this.rank = rank;
		
		this.cardImage = initCardImage();
	}
	
	private BufferedImage initCardImage()
	{
		try {
			cardImage = ImageIO.read(new File(imgPathName));
		} catch(IOException e) {
			e.printStackTrace();
		}
		return cardImage;
	}
}
