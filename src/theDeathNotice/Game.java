package theDeathNotice;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class represents a game of TheDeathNotice.
 * 
 * @author Skyla
 * @version 1
 *
 */
public class Game {
	
	private ArrayList<Player> players;
	private CardDeck cardDeck;
	private PricingModel model;
	private int currentPlayerId;
	private boolean isOver=false;
	
	/**
	 * A game of The Death Notice.
	 */
	public Game() {
		init();
	}
	
	/**
	 * A game of The Death Notice
	 * @param names The names of the players 
	 */
	public Game(List<String> names) {
		init();
		for (int i=0; i<names.size(); i++) {
			players.add(new Player(names.get(i), i));
		}
	}
	
	private void init() {
		cardDeck = new CardDeck(this);
		model = new PricingModel(this);
		players = new ArrayList<Player>();
	}
	
	/**
	 * @return the ID of the current player
	 */
	public int getCurrentPlayerId() {
		return currentPlayerId;
	}
	
	/**
	 * 
	 * @return the players in an ArrayList in the order of their standings
	 */
	public ArrayList<Player> getStandings() {
		ArrayList<Player> standings = new ArrayList<Player>();
		for (int i = 0; i < players.size(); i++) {
			standings.add(players.get(i));
		}
		boolean sorted = false;
		Player temp;
		while(!sorted) {
			sorted = true;
			for (int i = 1; i < standings.size(); i++) {
				if (standings.get(i).getPoints() < standings.get(i-1).getPoints()) {
					temp = standings.get(i);
					standings.set(i, standings.get(i-1));
					standings.set(i-1, temp);
					sorted = false;
				}
			}
		}
		return standings;
	}
	
	/**
	 * @return
	 */
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
	 * @return the player who's the current player
	 */
	public Player getCurrentPlayer() {
		return players.get(currentPlayerId);
	}
	
	/**
	 * @return the card deck of the game
	 */
	public CardDeck getCardDeck() {
		return cardDeck;
	}
	
	/**
	 * @return the pricing model of the game
	 */
	public PricingModel getPricingModel() {
		return model;
	}
	
	/**
	 * 
	 * @return the playerIDs of the dead players
	 */
	public List<Integer> getDeadPlayerIds() {
		ArrayList<Integer> dead = new ArrayList<>();
		for (int i=0; i<players.size(); i++) {
			if (!players.get(i).isAlive()) {
				dead.add(i);
			}
		}
		return dead;
	}

	/**
	 * @return the winner
	 */
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
				else if (player.getPoints() == maxPoint && earliestTime.compareTo(player.getTime()) > 0) {
			  	    winner = player;
					earliestTime = player.getTime();
				}
			}
		}
		return winner;
	}
	
	
	/**
	 * 
	 * @return whether or not there are multiple players with the same number of points
	 */
	public boolean hasMultiplePlayerWithSamePoints() {
		for (int i=0; i<players.size(); i++) {
			for (int j=i+1; j<players.size(); j++) {
				if (players.get(i).getPoints() == players.get(j).getPoints()) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * @return the number of players alive
	 */
	public int numOfAlivePlayers() {
		int res = 0;;
		
		for (Player player: players) {
			if (player.isAlive()) {
				res++;
			}
		}
		return res;
	}
	
	/**
	 * @return the point value of the alive player with the lowest point value
	 */
	public int getLowestPoint() {
		int res = Integer.MAX_VALUE;
		
		for (Player player: players) {
			if (player.isAlive()) {
				res = Math.min(res, player.getPoints());
			}
		}
		return res;
	}
	
	/**
	 * 
	 * @return whether the game is over or not
	 */
	public boolean isOver() {
		return isOver;
	}

	/**
	 * 
	 * @param isOver whether the game is over or not
	 */
	public void setOver(boolean isOver) {
		this.isOver = isOver;
	}
}
