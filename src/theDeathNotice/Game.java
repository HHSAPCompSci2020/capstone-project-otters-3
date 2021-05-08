package theDeathNotice;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a game of TheDeathNotice.
 * 
 * @author Andria and Skyla
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
	}
	
	public Game(List<String> names) {
		init();
		for (int i=0; i<names.size(); i++) {
			players.add(new Player(names.get(i), i));
		}
	}
	
	
	public int getPlayerTurn() {
		return playerTurn;
	}

	public void updatePlayerTurn() {
		playerTurn = (playerTurn+1)%(players.size());
	}

	/**
	 * 
	 * @return
	 */
	public Player getCurrentPlayer() {
		return players.get(playerTurn);
	}
	
	
	public CardDeck getCardDeck() {
		return cardDeck;
	}

	public Player getWinner() {
		int maxPoint = Integer.MIN_VALUE;
		LocalTime earliestTime = LocalTime.MAX;
		Player winner = null;
		for (Player player: players) {
			if (player.isAlive()) {
				if (player.getPoints() > maxPoint) {
			  	    winner = player;
				    maxPoint = player.getPoints();
				    earliestTime = player.getTimer();
				}
				else if (player.getPoints() == maxPoint && earliestTime.compareTo(player.getTimer())> 0) {
			  	    winner = player;
					earliestTime = player.getTimer();
				}
			}
		}
		return winner;
	}

	private void init() {
		cardDeck = new CardDeck();
		players = new ArrayList<Player>();
	}
}
