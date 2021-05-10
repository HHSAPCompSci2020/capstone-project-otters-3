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
	private int currentPlayerId;
	
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
	
	
	public int getCurrentPlayerId() {
		return currentPlayerId;
	}


	public boolean updateCurrentPlayerId() {
		//playerTurn = (playerTurn+1)%(players.size());
		if (numOfAlivePlayers()>1) {
			currentPlayerId = (currentPlayerId+1)%(players.size());
			Player player = getCurrentPlayer();
			while (!player.isAlive()) {
				currentPlayerId = (currentPlayerId+1)%(players.size());
				player = getCurrentPlayer();				
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @return
	 */
	public Player getCurrentPlayer() {
		return players.get(currentPlayerId);
	}
	
	public CardDeck getCardDeck() {
		return cardDeck;
	}
	
	public List<Integer> getDeadPlayerIds() {
		ArrayList<Integer> dead = new ArrayList<>();
		for (int i=0; i<players.size(); i++) {
			if (!players.get(i).isAlive()) {
				dead.add(i);
			}
		}
		return dead;
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
				    earliestTime = player.getTime();
				}
				else if (player.getPoints() == maxPoint && earliestTime.compareTo(player.getTime())> 0) {
			  	    winner = player;
					earliestTime = player.getTime();
				}
			}
		}
		return winner;
	}

	public boolean hasMultiplePlayerWithSamePoints() {
		for (int i=0; i<players.size(); i++) {
			for (int j=i+1; j<players.size(); j++) {
				if (players.get(i).getTime() == players.get(j).getTime()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int numOfAlivePlayers() {
		int res = 0;;
		
		for (Player player: players) {
			if (player.isAlive()) {
				res++;
			}
		}
		return res;
	}
	
	
	private void init() {
		cardDeck = new CardDeck();
		players = new ArrayList<Player>();
	}
}
