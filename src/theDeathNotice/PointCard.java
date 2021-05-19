package theDeathNotice;

/**
 * This class represents a standard card that gives you points.
 * Each card has one of the 4 suits and a value from ace to king.
 * 
 * @author Skyla
 * @version 1
 * 
 */
public class PointCard extends Card {

	private int pointValue;
	
	/**
	 * Creates a PointCard.
	 * @param cardID The ID of the card, related to the directory image of the card
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
	 * Adds the card value to the current player.
	 * Cards that are either Jack, Queen, or King have a value of 10 points.
	 * All other cards have a value of their card number.
	 * @param player Player that draws the card.
	 */
	public void act(Player player) {
		player.addPoints(pointValue);
	}

}