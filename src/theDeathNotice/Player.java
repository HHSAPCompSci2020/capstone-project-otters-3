package theDeathNotice;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 * 
 * @author Skyla
 * @version 1
 *
 */
public class Player {
	
	private String name;
	private int points;
	private int initialPlayerNumber;
	private LocalTime time;
	private ArrayList<Card> currentHand;
	private boolean alive;
	private int drawCount;
	

	/**
	 * This class represents a player.
	 * @param name the name of the player
	 * @param initialPlayerNumber the number of the player
	 */
	public Player(String name, int initialPlayerNumber) {
		this.name = name;
		this.initialPlayerNumber = initialPlayerNumber;
		alive = true;
		points = 30;
		points += initialPlayerNumber;
		currentHand = new ArrayList<Card>();
	}


	/**
	 * 
	 * @return the name of the player
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return the inital player number of the player
	 */
	public int getInitialPlayerNumber() {
		return initialPlayerNumber;
	}

	/**
	 * 
	 * @param points the number of points to set the points to
	 */
	public void setPoints(int points) {
		this.points = points;
	}


	/**
	 * 
	 * @return the number of points the player has
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * 
	 * @return the number of saving cards the player has
	 */
	public int getSaveCardCount() {
		int count = 0;
		for(Card card: currentHand) {
			if (card instanceof SavingCard) {
				count++;
			}
		}
		return count;
	}

	public LocalTime getTime() {
		return time;
	}

	/**
	 * adds points Added to the points
	 * @param number of points added to the field points (can be a negative number to subtract points)
	 */
	public void addPoints(int pointsAdded) {
		points += pointsAdded;
		time = LocalTime.now();	
	}
	
	/**
	 * Adds cardBought to the currentHand.
	 * @return cardBought the card to be added to the hand or null if no money left to buy card
	 */
	public Card buySaveCard() {
		if(points < SavingCard.CURRENT_COST) {
			return null;
		}
		points -= SavingCard.CURRENT_COST;
		time = LocalTime.now();	
		SavingCard card = new SavingCard("saver");
		addSaveCard(card);
		return card;
	}
	
	/**
	 * 
	 * @param card
	 */
	public void addSaveCard(Card card) {
       	currentHand.add(card);
	}
			
	/**
	 * 
	 * @return whether the player had a saving card or not
	 */
	public boolean removeSaveCard() {
		int i = 0;
	    while(i < currentHand.size()) {
		   if(currentHand.get(i) instanceof SavingCard) {
			   currentHand.remove(i);
			   return true;
		   }
		   else {
			   i++;
		   }
	   }
	   return false;
	}

	/**
	 * 
	 * @return whether the player is alive or not
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * 
	 * @param alive what to set the player's alive status to
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	/**
	 * Resets the draw count.
	 */
	public void resetDrawCount() {
		drawCount = 0;
	}
	
	/**
	 * 
	 * @return the drawCount
	 */
	public int getDrawCount() {
		return drawCount;
	}
	
	/**
	 * 
	 * @return true if the current player's draw count can be increased
	 * false if the current player's draw count is already 3
	 */
	public boolean increaseDrawCount() {
		if (drawCount<3) {
		   drawCount++;
		   return true;
		}
		return false;
	}
	/**
	 * Draws the top card from the deck of cards by adding it to the hand of the player and removing it from the card deck.
	 * @param cards the deck of cards in the game to draw from
	 * @post removes the top (index 0) card in the CardDeck passed in
	 */ 
	public void drawCard(CardDeck cards) {
		Card card = cards.drawTopCard();
		currentHand.add(card);
	}
}
