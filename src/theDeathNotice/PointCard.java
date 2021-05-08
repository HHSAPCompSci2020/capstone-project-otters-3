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
	public PointCard(String cardID) {
		super(cardID);
		int ind = cardID.indexOf('-');
		String type = cardID.substring(0, ind);
		if (type.equals("j") || type.equals("q") || type.equals("k")) {
			pointValue=10;
		}
		else {
			pointValue = Integer.parseInt(type);
		}
	}

	@Override
	public String toString() {
		return super.toString()+ "=>point:" + pointValue;
	}

	/**
	 * Adds the card value to the current player
	 * Card that is j q and k have 10 points
	 * @param player Player that draws the card.
	 */
	public void act(Player player) {
		player.addPoints(pointValue);
	}

}