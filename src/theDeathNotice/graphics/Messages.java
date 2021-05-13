package theDeathNotice.graphics;

public class Messages {
	
	/**
	 * This message pops up when somebody pressed the card deck when it's empty. 
	 */
	public final static String EMPTY_CARD_DECK= "Empty Card Deck";
	
	/**
	 * This message pops up when a player has not drawn a card yet.
	 */
	public final static String DRAW_CARD_FIRST = "Draw a card first";
	
	/**
	 * This message pops up when the card deck is empty.
	 */
	public final static String CARD_DECK_EMPTY="Card Deck Empty! Player {0} wins!";
	
	/**
	 * This message pops up when a player dies.
	 */
	public final static String PLAYER_DEAD = "Player {0} is dead";
	
	/**
	 * This message pops up when the game ends and someone wins.
	 */
	public final static String PLAYER_WIN = "Player {0} wins";
	
	/**
	 * This message pops up when a player tries to end their turn before drawing a card.
	 */
	public final static String PLAYER_MUST_DRAW_ONCE="You must at least draw one card";
	
	/**
	 * This message pops up when a player tries to buy a save card after they see a card in the deck.
	 */
	public final static String NOT_ALLOWD_TO_BUY_CARD="Buy saving card is not allowed after you see card in deck";
	
	/**
	 * This message pops up when a player who doesn't have enough money tries to buy a saving card.
	 */
	public final static String NO_ENOUCH_MONDY_TO_BUY_CARD="Player {0} does not have enough money to buy a saving card";
	
	/**
	 * This message pops up when a player has drawn 3 cards already.
	 */
    public final static String YIELD_TO_NEXT_PLAYER="Player {0} already played 3 times, please yield turn to next player";
    
    /**
     * This message pops up when a player does not take the card they drew.
     */
    public final static String PLAYER_TAKE_CARD="Player {0} please take the card away";
    
    /**
     * This message pops up when a player tries to end their turn before drawing a card.
     */
    public final static String END_TURN_NOT_ALLOWED="You must draw card to end turn";
}
