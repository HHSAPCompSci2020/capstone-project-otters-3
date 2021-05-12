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
	
	private void init() {
		cardDeck = new CardDeck(this);
		model = new PricingModel(this);
		players = new ArrayList<Player>();
	}
	
	public int getCurrentPlayerId() {
		return currentPlayerId;
	}

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
	
	public PricingModel getPricingModel() {
		return model;
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
				else if (player.getPoints() == maxPoint && earliestTime.compareTo(player.getTime()) > 0) {
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
				if (players.get(i).getPoints() == players.get(j).getPoints()) {
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
	
	public int getLowestPoint() {
		int res = Integer.MAX_VALUE;
		
		for (Player player: players) {
			if (player.isAlive()) {
				res = Math.min(res, player.getPoints());
			}
		}
		return res;
	}

	public boolean isOver() {
		return isOver;
	}

	public void setOver(boolean isOver) {
		this.isOver = isOver;
	}
}
