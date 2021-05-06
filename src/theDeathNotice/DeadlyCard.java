package theDeathNotice;

/**
 * This class represents a deadly card.
 * @author Skyla
 * @version 1
 *
 */
public class DeadlyCard extends Card {
	
	/** 
	 * Creates a deadly card.
	 * @param cardID
	 */
	public DeadlyCard(int cardID) {
		super(cardID, "deadlyCardImageFile"); // temporary replacement
	}
	
	@Override
	public void act(Player player) {
		
	}
}
