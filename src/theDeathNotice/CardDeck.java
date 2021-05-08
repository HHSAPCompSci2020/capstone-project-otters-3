package theDeathNotice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * This class represents a card deck.
 * @author Skyla
 * @version 1
 *
 */
public class CardDeck {
	
	private ArrayList<Card> cards;
		
	private String getSuit(int i) {
		if (i==1)
			return "c";
		else if (i==2)
			return "d";
		else if (i==3)
			return "h";
		else if (i==4) 
			return "s";
		else 
			return "c";
	}
	
	private String getType(int i) {
		if (i>=2 && i<=10) {
			return String.valueOf(i);
		}
		else if (i==11) {
			return "j";
		}
		else if (i==12) {
			return "q";
		}
		else if (i==13) {
			return "k";
		}
		else 
			return "dead";
			
	}
	
	/**
	 * Creates a CardDeck with a standard deck of cards.
	 */
	public CardDeck() {
		cards = new ArrayList<Card>();
		
		for (int i=1; i<=4; i++) {
			cards.add(new DeadlyCard("dead"+"-" + String.valueOf(i)));
		}
		for (int n = 2; n <= 13; n++) {
			for (int q = 1; q <= 4; q++) {	    
				cards.add(new PointCard(getType(n)+"-"+getSuit(q)));
			}
		}
		for (int i=1; i<=4; i++) {
			cards.add(new DeadlyCard("dead"+"-" + String.valueOf(i)));
		}
	}
	
	/**
	 * Removes the card at index 0 of cards.
	 * @return the card removed or null if there are no more cards to draw
	 */
	public Card drawTopCard() {
		if(cards.size()==0) {
			return null;
		}
		return cards.remove(0);
	}
	
	/**
	 * Removes the card at index 0 of cards.
	 * @return the top card in the deck or null if there are no more cards in deck
	 */
	public Card peekTopCard() {
		if(cards.size()==0) {
			return null;
		}
		return cards.get(0);
	}
	
	public int getNumOfCards() {
		return cards.size();
	}
	
	/** 
	 * Shuffles the deck.
	 */
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}
	 
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
	    for (Card card: cards)  {
	    	buf.append(card);
	    	buf.append("\n");
	    }
	    return buf.toString();
	}

	public static void main(String args[]) {
		CardDeck c = new CardDeck();
		c.shuffleDeck();
		c.shuffleDeck();
		c.shuffleDeck();
		System.out.println(c.toString());
		System.out.println("remain card=" + c.getNumOfCards());
		
		while (c.getNumOfCards() > 0) {
		Card card = c.drawTopCard();
		try {
			card.drawImage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
