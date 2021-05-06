package suffocatingOtters;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * 
 * @author Andria
 * @version 1
 *
 */
public class CardDeck {
	
	private ArrayList<Card> cards;
	private ArrayList<Card> location; //helper field
	
	/**
	 * Creates a CardDeck with a standard deck of cards.
	 */
	public CardDeck() {
		cards = new ArrayList<Card>();
		for (int n = 0; n < 13; n++) {
			for (int q = 1; q <= 4; q++) {
//				cards.add(new Card(n, q));
			}
		}
	}
	
	/**
	 * Removes the card at index 0 of cards.
	 * @return the card removed
	 */
	public Card drawTopCard() {
		return cards.remove(0);
	}
	
	/** 
	 * Shuffles the deck.
	 */
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

}
