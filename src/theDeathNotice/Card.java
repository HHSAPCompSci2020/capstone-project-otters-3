package theDeathNotice;

/**
 * This class represents a card.
 * @author Skyla
 * @version 1
 *
 */
public abstract class Card {
	private int cardID;
	private String imageFile;

	/** 
	 * 
	 * @param cardID the ID of the doc
	 * @param imageFile The directory of the image of the card.
	 */
	public Card(int cardID, String imageFile) {
		
	}
	
	
	public int getCardID() {
		return cardID;
	}


	public void setCardID(int cardID) {
		this.cardID = cardID;
	}


	public String getImageFile() {
		return imageFile;
	}


	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
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
