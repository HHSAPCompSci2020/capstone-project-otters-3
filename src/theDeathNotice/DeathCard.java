package theDeathNotice;


/**
 * This class represents a deadly card.
 * @author Skyla
 * @version 1
 *
 */
public class DeathCard extends Card {
	
	/** 
	 * Creates a deadly card.
	 * @param cardID
	 */
	public DeathCard(String cardID) {
		super(cardID);
	}
	
	/**
	 * If the current player hand has saver card, remove one saving card
	 * and mark the player as alive or dead.
	 * @param player Player that draws the card.
	 */
	public void act(Player player) {
        player.setAlive(player.removeSaveCard());
        if (!player.isAlive()) {
        	player.setPoints(0);
        }
	}
}
