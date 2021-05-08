package theDeathNotice.graphics;

import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

import theDeathNotice.Game;

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
	 public MainGame() {
		 initComponents();
	 }
	 
	 private void initComponents() {
		 takeCardButton = new javax.swing.JButton();
	        endTurnButton = new javax.swing.JButton();
	        instructionsButton = new javax.swing.JButton();
	        buySaveCardButton = new javax.swing.JButton();
	        URL file = ClassLoader.getSystemClassLoader().getResource("cards/back.png");
	        BufferedImage image=null;
	        try {
				image = ImageIO.read(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        ImageIcon icon = new ImageIcon(image);
	        deckButton = new javax.swing.JButton(icon);
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
	 
	 private void takeCardButtonActionPerformed(ActionEvent evt) {
		 
	 }
	 
	 private void endTurnButtonActionPerformed(ActionEvent evt) {
		 
	 }
	 
	 private void instructionsButtonActionPerformed(ActionEvent evt) {
		 
	 }
	 
	 private void buySaveCardButtonActionPerformed(ActionEvent evt) {
		 
	 }
	 
	 private void deckButtonActionPerformed(ActionEvent evt) {
		 
	 }
	 
	 public static void main(String args[]) {
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
	                new MainGame().setVisible(true);
	            }
	        });
	    }
	
}