package theDeathNotice;

/**
 * This class represents a standard card that gives you points.
 * 
 * @author Skyla
 * @version 1
 * 
 */
public class PointCard extends Card {

	private int pointValue;
	
	/**
	 * Creates a PointCard.
	 * @param cardID The ID of the card.
	 * @param imageFile The directory of the image of the card.
	 */
	public PointCard(int cardID, String imageFile) {
		super(cardID, imageFile);
	}

	
	/**
	 * Acts how it would when the player draws the card.
	 * @param player Player that draws the card.
	 */
	public void act(Player player) {
		
	}

}