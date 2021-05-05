package suffocatingOtters;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author skyla and andria
 * @version 1
 *
 */
public class CardDeck {
	
	private ArrayList<Card> cards;
	
	/**
	 * 
	 */
	public CardDeck() {
		
	}
	
	public Card getTopCard() {
		return cards.remove(0);
	}
	
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

}
