package suffocatingOtters;

/**
 * 
 * @author skyla and andria
 * @verison 1
 *
 */
public class Card {
	
	private int num;
	private int quality; //the suit (spades (1), hearts (2), diamonds (3), or clubs (4))
	
	/**
	 * 
	 */
	public Card() {
		
	}
	
	/**
	 * 
	 */
	public void act(Player player) {
		player.addPoints(num);
	}
}
