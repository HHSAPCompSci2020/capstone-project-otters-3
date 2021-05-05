package suffocatingOtters;

import java.util.ArrayList;

/**
 * 
 * @author skyla and andria
 * @version 1
 *
 */
public class Player {
	
	private int points;
	private ArrayList<Card> currentHand;
	
	/**
	 * 
	 */
	public Player() {
		
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
		currentHand.add(cards.drawTopCard());
	}
	

}
