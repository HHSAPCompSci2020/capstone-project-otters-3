package suffocatingOtters;

/**
 * 
 * @author skyla and andria
 * @version 1
 *
 */
public class Card {
	
	protected int num;
	protected int suit; //the suit (spades (1), hearts (2), diamonds (3), or clubs (4))
	
	/**
	 * Creates a card with the value num and the suit suit.
	 * @param num a number from 1-13 that represents the number of the card and the points the card is worth
	 * @param suit a number from 1-4; spades (1), hearts (2), diamonds (3), or clubs (4)
	 */
	public Card(int num, int suit) {
		this.num = num;
		this.suit = suit;
	}
	

//	public void act(Player player) {
//		if (num == 1) {
//			return;
//		} 
//	
	
	/**
	 * @return the field num
	 */
	public int getNum() {
		return num;
	}
}
