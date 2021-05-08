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
	public DeadlyCard(String cardID) {
		super(cardID);
	}
	
	/**
	 * If the current player hand has saver card, remove one saver card
	 * and Mark the player as alive or not
	 * @param player Player that draws the card.
	 */
	public void act(Player player) {
        player.setAlive(player.removeSaveCard());
	}
}
