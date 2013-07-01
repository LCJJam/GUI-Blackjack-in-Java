package deck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * @author Jonathan Ho
 * A class that represents a deck.
 * Implements List from Java Collections but not all methods implemented.
 */
public class Deck implements List<Card>
{	
	private List<Card> deck = new ArrayList<Card>();
	private Random random = new Random();
	
	// Default constructor meaning use one deck
	public Deck()
	{
		deck = Card.getDeck();
		shuffleDeck(deck);
	}
	
	// Overloaded constructor using desired amount of decks
	public Deck(int decks)
	{
		for (int counter = 0; counter < decks; counter++)
		{
			// adds all elements from any type of collection
			// to the end of the list
			deck.addAll(Card.getDeck());
		}
		shuffleDeck(deck);
	}
	
	// Shuffles the deck
	public void shuffleDeck(List<Card> shuffDeck)
	{
		int curr_index, new_loc;
		Card tempCard;
		for (curr_index = 0; curr_index < shuffDeck.size(); curr_index++)
		{
			new_loc = random.nextInt(shuffDeck.size());
			tempCard = shuffDeck.get(curr_index);
			shuffDeck.set(curr_index, shuffDeck.get(new_loc));
			shuffDeck.set(new_loc, tempCard);
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	// returns the object at the specified index
	@Override
	public Card get(int index) 
	{
		// TODO Auto-generated method stub
		return deck.get(index);
	}

	// returns the index of the Card object
	@Override
	public int indexOf(Object o) 
	{
		// TODO Auto-generated method stub
		return deck.indexOf(o);
	}

	// returns a boolean statement whether or not the deck is empty
	@Override
	public boolean isEmpty() 
	{
		// TODO Auto-generated method stub
		return deck.isEmpty();
	}

	@Override
	public Iterator<Card> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	// returns a ListIterator
	// from there the methods from ListIterator can be called
	// from outside this class. The method next() works to show the next
	// element in the list
	@Override
	public ListIterator<Card> listIterator() 
	{
		// TODO Auto-generated method stub
		return deck.listIterator();
	}

	// returns a ListIterator from a specified index
	@Override
	public ListIterator<Card> listIterator(int index) {
		// TODO Auto-generated method stub
		return deck.listIterator(index);
	}

	// getter for size of the deck
	// returns the int size of the deck
	@Override
	public int size() 
	{
		// TODO Auto-generated method stub
		return deck.size();
	}

	// returns the object as an array of Card by casting it
	@Override
	public Card[] toArray() 
	{
		// TODO Auto-generated method stub
		return (Card[]) deck.toArray();
	}

	@Override
	public boolean add(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends Card> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Card> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Card set(int index, Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card remove(int index) 
	{
		// TODO Auto-generated method stub
		return deck.remove(index);
	}

	@Override
	public List<Card> subList(int toFrom, int toEnd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
}	
