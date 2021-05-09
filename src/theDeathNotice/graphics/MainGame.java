package theDeathNotice.graphics;

import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;

import theDeathNotice.Card;
import theDeathNotice.CardDeck;
import theDeathNotice.Game;
import theDeathNotice.Player;

/**
 * 
 * @author Skyla
 * @version 1
 * 
 * This class represents the window or page where the main game is taking place.
 * There is a scoreboard that refreshes each turn on the left side, the draw deck
 * in the middle, and buttons to draw, end your turn, see the instructions, visit 
 * the store, and see players' cards on the right side.  
 *
 */
public class MainGame extends JFrame{
	 private static final String DEFAULT_DECK_IMAGE = "cards/back.png";
	 private JButton takeCardButton;
	 private JButton endTurnButton;
	 private JButton instructionsButton;
	 private JButton buySaveCardButton;
	 private JButton deckButton;
	 private JLabel scoreBoardLabel;
	 private JLabel player1Points;
	 private JLabel player2Points;
	 private JLabel player3Points;
	 private JLabel player4Points;
	 private Game game;
	 
	 /**
	  * Initializes the page.
	  */
	 public MainGame(List<String> playerNames) {
		 initGame(playerNames);		 
		 initComponents();
		 player1Points.setOpaque(true);
		 player1Points.setBackground(new java.awt.Color(255, 255, 255));
		 player2Points.setOpaque(true);
		 player2Points.setBackground(new java.awt.Color(255, 255, 255));
		 player3Points.setOpaque(true);
		 player3Points.setBackground(new java.awt.Color(255, 255, 255));
		 player4Points.setOpaque(true);
		 player4Points.setBackground(new java.awt.Color(255, 255, 255));
		 if (playerNames.size() == 2) {
			 player1Points.setText("Player " + playerNames.get(0) + ": " + 30);
			 player2Points.setText("Player " + playerNames.get(1) + ": " + 31);
		 }
		 if (playerNames.size() == 3) {
			 player1Points.setText("Player " + playerNames.get(0) + ": " + 30);
			 player2Points.setText("Player " + playerNames.get(1) + ": " + 31);
			 player3Points.setText("Player " + playerNames.get(2) + ": " + 32);
		 }
		 if (playerNames.size() == 4) {
			 player1Points.setText("Player " + playerNames.get(0) + ": " + 30);
			 player2Points.setText("Player " + playerNames.get(1) + ": " + 31);
			 player3Points.setText("Player " + playerNames.get(2) + ": " + 32);
			 player4Points.setText("Player " + playerNames.get(3) + ": " + 33);
		 }
	     refreshScoreBoard();
	 }
	 
	 private void msgbox(String s) {
		 JOptionPane.showMessageDialog(this, s);
	 }
	 
	 private void initGame(List<String> playerNames) {
		 game = new Game(playerNames);
		 CardDeck deck = game.getCardDeck();
		 deck.shuffleDeck();
		 deck.shuffleDeck();
		 deck.shuffleDeck();	 
	 }
	 
	 private void initComponents() {
		 takeCardButton = new javax.swing.JButton();
	        endTurnButton = new javax.swing.JButton();
	        instructionsButton = new javax.swing.JButton();
	        buySaveCardButton = new javax.swing.JButton();
	        deckButton = new javax.swing.JButton();
	        resetDeckButtonIcon(DEFAULT_DECK_IMAGE);
	        scoreBoardLabel = new javax.swing.JLabel();
	        player1Points = new javax.swing.JLabel();
	        player2Points = new javax.swing.JLabel();
	        player3Points = new javax.swing.JLabel();
	        player4Points = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        
	        takeCardButton.setBackground(new java.awt.Color(255, 153, 153));
	        takeCardButton.setText("Take Card");
	        takeCardButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                takeCardButtonActionPerformed(evt);
	            }
	        });

	        endTurnButton.setBackground(new java.awt.Color(0, 204, 204));
	        endTurnButton.setText("End Turn");
	        endTurnButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                endTurnButtonActionPerformed(evt);
	            }
	        });

	        instructionsButton.setBackground(new java.awt.Color(204, 204, 255));
	        instructionsButton.setText("Instructions");
	        instructionsButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                instructionsButtonActionPerformed(evt);
	            }
	        });

	        buySaveCardButton.setBackground(new java.awt.Color(153, 255, 153));
	        buySaveCardButton.setText("Buy Save Card ");
	        buySaveCardButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buySaveCardButtonActionPerformed(evt);
	            }
	        });

	        deckButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                deckButtonActionPerformed(evt);
	            }
	        });

	        scoreBoardLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
	        scoreBoardLabel.setText("Scoreboard: ");

	        player1Points.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
	        player1Points.setText("Player 1: ");

	        player2Points.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
	        player2Points.setText("Player 2:");

	        player3Points.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
	        player3Points.setText("Player 3:");

	        player4Points.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
	        player4Points.setText("Player 4: ");
	        

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap(28, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(scoreBoardLabel)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(player4Points)
	                            .addComponent(player1Points)
	                            .addComponent(player2Points)
	                            .addComponent(player3Points))
	                        .addGap(102, 102, 102)
	                        .addComponent(deckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(96, 96, 96)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(instructionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(endTurnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(takeCardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(buySaveCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addContainerGap(82, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap(87, Short.MAX_VALUE)
	                .addComponent(scoreBoardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(35, 35, 35)
	                        .addComponent(player1Points))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(takeCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(30, 30, 30)
	                        .addComponent(player2Points)
	                        .addGap(37, 37, 37)
	                        .addComponent(player3Points)
	                        .addGap(32, 32, 32)
	                        .addComponent(player4Points)
	                        .addContainerGap(132, Short.MAX_VALUE))
	                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
	                        .addGap(18, 18, 18)
	                        .addComponent(endTurnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(instructionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(buySaveCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(deckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        pack();

	 }
	 
	 private void resetDeckButtonIcon(String iconFile) {
         URL file = ClassLoader.getSystemClassLoader().getResource(iconFile);
         BufferedImage image=null;
         try {
			  image = ImageIO.read(file);
		   } catch (IOException e) {
			  // TODO Auto-generated catch block
			   e.printStackTrace();
		}
         ImageIcon icon = new ImageIcon(image);
         deckButton.setIcon(icon);
	 }
	 
	 private void takeCardButtonActionPerformed(ActionEvent evt) {
		    CardDeck deck = game.getCardDeck();
		    Player player = game.getCurrentPlayer();
		    if (player.isAlive()) {
			    Card card = deck.drawTopCard();
			    if (card == null) {
			    	msgbox("There is no card left to draw");
			    }
			    else if (deck.isTopCardVisible()){
			    	resetDeckButtonIcon(DEFAULT_DECK_IMAGE);
			    	deck.setTopCardVisible(false);
				    card.act(player);
				    refreshScoreBoard();			 
				    if (!player.isAlive()) {
				    	msgbox("Player " + player.getName() + " is dead");
				    	//markDead();
				    	endTurnActionInternal(player);
				    }
				    else {
					    card = deck.peekTopCard();
					    if (card == null) {
					    	msgbox("Empty Card Deck! and Player " + game.getWinner().getName() + " wins");
					    }
				    }
	
			    }
			    else {
			    	msgbox("You must draw card first");
			    }	 
		    }
		    else {
		    	msgbox("Player " + player.getName() + " is dead");
		    }
	 }
	 
	 private void endTurnActionInternal(Player player) {
		 player.resetDrawCount(); 
		 if (!game.updateCurrentPlayerId()) {
			player = game.getWinner();
			msgbox("Player " + player.getName() + " wins");
		 }	
		 else {
		    refreshScoreBoard();
		 }
	 }
	 
	 private void endTurnButtonActionPerformed(ActionEvent evt) {
		 Player player = game.getCurrentPlayer();
		 if (player.isAlive()) {	 
			 if (player.getDrawCount() == 0)
			 {
				 msgbox("You must at least draw once before you can end your turn");
			 }
			 else {
				 endTurnActionInternal(player);
			 }
		 }
		 else {
			   msgbox("Player " + player.getName() + " is dead");
		 }
	 }
	 
	 private void instructionsButtonActionPerformed(ActionEvent evt) {
		 
	 }
	 
	 
	 private void buySaveCardButtonActionPerformed(ActionEvent evt) {
		 Player player = game.getCurrentPlayer();
		 if (player.isAlive()) {	 
			 CardDeck deck = game.getCardDeck();
			 if (deck.isTopCardVisible())
			 {
				  msgbox("You can only buy save top before you draw card");
			 }
			 else {
				 Card card = player.buySaveCard();
				 if (card == null) {
					 msgbox("Player " + player.getName() + " has not enough money to buy ");
				 }
				 else {
					 refreshScoreBoard();
				 }
			 }
		 }
		 else {
			 msgbox("Player " + player.getName() + " is dead");
		 }
	 }
	 
	 private void deckButtonActionPerformed(ActionEvent evt) {
		 CardDeck deck = game.getCardDeck();
		 Player player = game.getCurrentPlayer();
		 if (player.isAlive()) {
			 if (!deck.isTopCardVisible()) {
				boolean result = player.increaseDrawCount();
				if (result) {
				    Card card = deck.peekTopCard();
				    if (card == null) {
				    	msgbox("Empty Card Deck! and Player " + game.getWinner().getName() + " wins");
				    }
				    else {
					   deck.setTopCardVisible(true);
		               resetDeckButtonIcon(card.getImageFile());
				    }
				}
				else {
					msgbox("Player " + player.getName() + " already played 3 times, please yield turn to next player");
				}
			 }
			 else {
				 msgbox("Player " + player.getName() + " please take the card away!");
			 }
		 }
		 else {
			 msgbox("Player " + player.getName() + " is dead");
		 }
	 }
	 
	 
	 private String appendStar(int count) {
		 String text="";
		 for (int i=1; i<=count; i++) {
			 text = text + "*";
		 }
		 return text;
	 }
	 
	 
	 JLabel getlabel(int playerId) {
		 if (playerId == 0)
			 return player1Points;
		 else if (playerId == 1)
			 return player2Points; 
		 else if (playerId == 2)
			 return player3Points; 
		 else if (playerId == 3)
			 return player4Points;
		 else 
		     return player1Points;
	 }
	 
	 private void markDead() {
		 List<Integer> ds = game.getDeadPlayerIds();
		 for (Integer i: ds) {
			 JLabel label = getlabel(i);
			 label.setBackground(new java.awt.Color(128, 128, 128));
		 }
		 
	 }
	 
	 private void resetOriginal() {
		 int playerId = game.getCurrentPlayerId();
		 List<Integer> ds = game.getDeadPlayerIds();
		 for (int id=0; id<4; id++) {
			 if (id!=playerId && !ds.contains(id)) {
				 JLabel label = getlabel(id);
				 label.setBackground(new java.awt.Color(255, 255, 255));
			 }
		 }
	 }
	 
	 private void markCurrent() {
	    Player player = game.getCurrentPlayer();	
	    int point = player.getPoints(); 
	    int playerId = game.getCurrentPlayerId();
	    JLabel label= getlabel(playerId);
		label.setBackground(new java.awt.Color(255, 153, 153));
		label.setText("Player " + player.getName() + ": " + point + " "+appendStar(player.getSaveCardCount()));	 
	 }
	 
	 private void refreshScoreBoard() {
		markDead();
		resetOriginal();
        markCurrent();
	 }
	 
	 public static void main(String args[]) {
		    String[] names = {"Skyla", "Andria", "Lindsay", "Dave"};
		    List<String> playerNames = Arrays.asList(names);	    
		    
	        /* Set the Nimbus look and feel */
	        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	         */
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new MainGame(playerNames).setVisible(true);
	            }
	        });
	        
	    } 

	
}