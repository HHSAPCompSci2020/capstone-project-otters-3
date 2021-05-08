package theDeathNotice;

import java.util.ArrayList;

/**
 * This class represents a game of TheDeathNotice.
 * 
 * @author Andria
 * @version 1
 *
 */
public class Game {
	
	private ArrayList<Player> players;
	private CardDeck cardDeck;
	private int playerTurn;
	
	/**
	 * A game of Suffocating Otters.
	 */
	public Game() {
		init();
		cardDeck = new CardDeck();
		players = new ArrayList<Player>();
	}
	
	public Game(ArrayList<String> names) {
		for(String s: names) {
			players.add(new Player(s));
		}
	}
	
	/**
	 * Draws a card.
	 */
	public void draw() {
		
	}
	
	/**
	 * Buys a save card.
	 */
	public void buySaveCard() {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public Player getCurrentPlayer() {
		return players.get(playerTurn);
	}
	
	/**
	 * 
	 * @return
	 */
	public Player getNextPlayer() {
		return players.get((playerTurn+1)%(players.size()));
	}
	
	
	public CardDeck getCardDeck() {
		return cardDeck;
	}

	public void setCardDeck(CardDeck cardDeck) {
		this.cardDeck = cardDeck;
	}

	private void init() {
		
	}
}
