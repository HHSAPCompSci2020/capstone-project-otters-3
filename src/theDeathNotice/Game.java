package theDeathNotice;

import java.util.ArrayList;

/**
 * 
 * @author Andria
 * @version 1
 *
 */
public class Game {
	
	private ArrayList<Player> players;
	private CardDeck cardDeck;
	
	/**
	 * A game of Suffocating Otters.
	 */
	public Game() {
		inIt();
		cardDeck = new CardDeck();
		players = new ArrayList<Player>();
	}
	
	public Game(ArrayList<String> names) {
		for(String s: names) {
			players.add(new Player(s));
		}
	}
	
	/**
	 * Starts the current player's turn.
	 */
	public void haveTurn() {
		
	}
	
	/**
	 * Ends the current player's turn.
	 */
	public void endTurn() {
		
	}
	
	private void inIt() {
		
	}
}
