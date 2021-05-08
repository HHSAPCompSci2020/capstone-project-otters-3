package theDeathNotice;

/**
 * This class represents a card.
 * @author Skyla
 * @version 1
 *
 */
public abstract class Card {
	private String cardID;
	private String imageFile;

	/** 
	 * 
	 * @param cardID the unique ID of the card
	 */
	public Card(String cardID) {
		this.cardID = cardID;
		this.imageFile = "cards/" + cardID + ".png";
	}
	
	/**
	 * Gets the ID of the card.
	 * 
	 * @return the ID of the card
	 */
	public String getCardID() {
		return cardID;
	}

	/**
	 * Gets the full path of the image file of the card. 
	 * 
	 * @return returns the image file of the card
	 */
	public String getImageFile() {
		return imageFile;
	}

	/** 
	 * Draws the card using the imageFile.
	 */
	public void drawImage() {
		
	}

	
	@Override
	public String toString() {
		return this.cardID;
	}


	/**
	 * Acts how it would if a player plays the card.
	 * @param player Player that plays the card.
	 */
	public abstract void act(Player player);
	
	
}
