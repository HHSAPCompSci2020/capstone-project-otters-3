package suffocatingOtters;

/**
 * 
 * @author Skyla
 * @version 1
 *
 */
public abstract class Card {
	int cardID;
	String imageFile;

	/** 
	 * 
	 * @param cardID the ID of the doc
	 * @param imageFile The directory of the image of the card.
	 */
	public Card(int cardID, String imageFile) {
		
	}
	
	
	/** 
	 * Draws the card using the imageFile.
	 */
	public void drawImage() {
		
	}

	/**
	 * Acts how it would if a player plays the card.
	 * @param player Player that plays the card.
	 */
	public abstract void act(Player player);
	
	
}
