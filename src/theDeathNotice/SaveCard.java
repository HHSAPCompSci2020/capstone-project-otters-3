package theDeathNotice;

/**
 * This class represents a "Save Yourself" card.
 * 
 * @author Skyla
 * @version 1
 *
 */
public class SaveCard extends Card {
	
	/** 
	 * Creates a SaveCard.
	 */
	public SaveCard(String cardID) {
		super(cardID);
	}

	@Override
	public void act(Player player) {
		player.addSaveCard(this);
	}
}
