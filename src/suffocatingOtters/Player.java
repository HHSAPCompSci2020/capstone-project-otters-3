package suffocatingOtters;

import java.util.ArrayList;

/**
 * 
 * @author Andria
 * @version 1
 *
 */
public class Player {
	
	private int points;
	private ArrayList<Card> currentHand;
	private boolean alive;
	String name;
	
	/**
	 * 
	 */
	public Player(String name) {
		this.name = name;
		alive = true;
		points = 20;
		currentHand = new ArrayList<Card>();
	}

	/**
	 * adds pointsAdded to the points
	 * @param number of points added to the field points (can be a negative number to subtract points)
	 */
	public void addPoints(int pointsAdded) {
		points += pointsAdded;
	}
	
	/**
	 * Adds cardBought to the currentHand.
	 * @param cardBought the card to be added to the hand
	 */
	public void buyCard(Card cardBought) {
		currentHand.add(cardBought);
	}
	

	/**
	 * Draws the top card from the deck of cards by adding it to the hand of the player and removing it from the card deck.
	 * @param cards the deck of cards in the game to draw from
	 * @post removes the top (index 0) card in the CardDeck passed in
	 */ 
	public void drawCard(CardDeck cards) {
		Card card = cards.drawTopCard();
		currentHand.add(card);
//		if (card.getNum() == 1) {
//			boolean hasSaveCard = false;
//			int i = -1; 
//			for (int n = 0; n < currentHand.size(); i++) {
//				if (currentHand.get(n) instanceof SaveCard) {
//					hasSaveCard = true;
//					i = n;
//				}
//			}
//			if (hasSaveCard) {
//				currentHand.remove(i);
//			} else {
//				alive = false;
//			}
//			return;
//		}
	}
	
}
