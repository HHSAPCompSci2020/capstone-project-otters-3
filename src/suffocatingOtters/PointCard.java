package suffocatingOtters;

/**
 * 
 * @author skyla and andria
 * @version 1
 *
 */
public class PointCard extends Card {

	private int pointValue;
	
	/**
	 * Creates a PointCard.
	 * @param cardID 
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