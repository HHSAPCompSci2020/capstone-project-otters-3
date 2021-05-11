package theDeathNotice;

/**
 * This class represents a "Save Yourself" card.
 * 
 * @author Skyla
 * @version 1
 *
 */
public class SavingCard extends Card {
	private final static int INITIAL_COST=30;
	public static int CURRENT_COST = INITIAL_COST;
   
	/** 
	 * Creates a SaveCard.
	 */
	public SavingCard(String cardID) {
		super(cardID);
	}

	/**
	 * A saving card drawn from card deck is rewarded as two cards
	 * @param player Player that draws the card.
	 */
	public void act(Player player) {
		player.addSaveCard(this);
		player.addSaveCard(new SavingCard("saving"));	
	}
}
