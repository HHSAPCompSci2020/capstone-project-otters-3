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
	 * 
	 */
	public void draw() {
		
	}
	

}
