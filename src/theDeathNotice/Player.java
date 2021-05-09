package theDeathNotice;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 * 
 * @author Andria and Skyla
 * @version 1
 *
 */
public class Player {
	
	private String name;
	private int points;
	private int initialPlayerNumber;
	private LocalTime timer;
	private ArrayList<Card> currentHand;
	private boolean alive;
	private int drawCount;
	
	/**
	 * 
	 */
	public Player(String name, int initialPlayerNumber) {
		this.name = name;
		this.initialPlayerNumber = initialPlayerNumber;
		alive = true;
		points = 30;
		points += initialPlayerNumber;
		currentHand = new ArrayList<Card>();
	}



	public String getName() {
		return name;
	}

	

	public int getInitialPlayerNumber() {
		return initialPlayerNumber;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public int getPoints() {
		return points;
	}

	public int getSaveCardCount() {
		int count = 0;
		for(Card card: currentHand) {
			if (card instanceof SaveCard) {
				count++;
			}
		}
		return count;
	}

	public LocalTime getTimer() {
		return timer;
	}

	/**
	 * adds pointsAdded to the points
	 * @param number of points added to the field points (can be a negative number to subtract points)
	 */
	public void addPoints(int pointsAdded) {
		points += pointsAdded;
		timer = LocalTime.now();
	}
	
	/**
	 * Adds cardBought to the currentHand.
	 * @return cardBought the card to be added to the hand or null if no money left to buy card
	 */
	public Card buySaveCard() {
		if(points < SaveCard.SAVE_CARD_COST) {
			return null;
		}
		points -= SaveCard.SAVE_CARD_COST;
		SaveCard card = new SaveCard("saver");
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
	 * @return
	 */
	public boolean removeSaveCard() {
		int i = 0;
	    while(i < currentHand.size()) {
		   if(currentHand.get(i) instanceof SaveCard) {
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
	 * @return
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * 
	 * @param alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	/**
	 * 
	 */
	public void resetDrawCount() {
		drawCount = 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getDrawCount() {
		return drawCount;
	}
	
	/**
	 * 
	 * @return
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
