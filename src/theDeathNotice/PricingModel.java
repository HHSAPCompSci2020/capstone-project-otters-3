package theDeathNotice;

/**
 * This class represents a class to implement the adaptive SavingCard cost.
 * 
 * @author Skyla
 * @version 1
 * 
 */
public class PricingModel {
	private Game game;
	private int currentPrice;
	private int invokedCount;
	
	public PricingModel(Game game) {
         this.game = game;
         this.currentPrice = 30;
         this.invokedCount = 0;
         
	}
	
	/** We borrowed the idea of Simulated annealing to dynamically adjust the price
	 *  of a saving card from time to time to keep the game going and more unpredictable and entertaining:
	 * 1. encourage everyone to buy saving card so the price will be less than the lowest point of 
	 *    all alive players who has points above 10m or above;
	 * 2. the shorter the distance from a dead card, the higher price of the saving cards;
	 * 3. price will be rounded to multiple of 5.
	 * 
	 * This class calculates the new price of the SavingCard.
	 * @return the new price of the SavingCard
	 */
	public int getPrice() {
		
		// Get distance from next dead card.
		CardDeck deck = game.getCardDeck();
		int distance = deck.getDeathDistance();
			 
		if (this.invokedCount % 5 == 0 || distance < 4) {
			// Get minimum points from active players
			int lowest = Math.max(10, game.getLowestPoint());
			
			//int distance = deck.getDeathDistance();
			int totalCards = deck.getNumOfCards();
			//distance = Math.max(1, (totalCards - distance) * lowest / totalCards ); 
			int dAdj = this.currentPrice;
			if (distance < 5 && totalCards >= 5)
				dAdj = this.currentPrice * 5;
				
			this.currentPrice = Math.max(10, Math.min(lowest, dAdj)) / 5 * 5;
			//System.out.printf("distance: %d, lowest: %d, price: %d\n", distance, lowest, this.currentPrice);
		}
		this.invokedCount++;
		
		return this.currentPrice;
	}
	
//	public void main(String args[]) {
//		int n = getPrice();
//		System.out.printf("price: %d", n);
//		
//	}
}
