package theDeathNotice.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import jay.jaysound.JayLayer;
import jay.jaysound.JayLayerListener;
import theDeathNotice.CardDeck;
import theDeathNotice.Game;
import theDeathNotice.Player;
import theDeathNotice.SavingCard;

/**
 * @author Andria
 * @version 1.0
 * 
 * This class represents the last page.
 */

public class EndingPage extends JFrame implements JayLayerListener {
	private static final String BALLOON_IMAGE = "images/congratulations.png";
	private Game game;
	private JLabel jLabel1;
	private JLabel winnerName;
	private JLabel winnerPoints;
	private JLabel winnerTime;
	private JButton playAgain;
	private JButton endGame;
	
	private JayLayer sound;
	private JComboBox<String> effects;

	/**
	 * initializes the game
	 * @param game the completed game with the player standings
	 */
	public EndingPage(Game game) {
		this.game=game;
//		super("Congratulations!");
//		setSize(400, 300);
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(null);
//		add(new JPanel());
//		
//		getContentPane().setBackground(new Color(145, 242, 145)); 
//		
//		String[] soundEffects = new String[]{"applause.mp3", "applause.mp3"};
//		effects = new JComboBox<String>(soundEffects);
//		add(effects);
//		
//		sound=new JayLayer("audio/","audio/",false);
//		sound.addPlayList();
//		sound.addSongs(0, soundEffects);
//		sound.changePlayList(0);
//		sound.addJayLayerListener(this);
//		
//		second = new JLabel();
//		third = new JLabel();
//		fourth = new JLabel();
//		JLabel[] labels = new JLabel[] {null, second, third, fourth};
//		String[] nums = new String[] {"1st", "2nd", "3rd", "4th"};
//		
////		ArrayList<Player> playerStandings = game.getStandings();
//		
////		for (int i = 1; i < 3; i++) {
////			if (i < playerStandings.size()) {
////				labels[i].setText(nums[i] + ": " + playerStandings.get(i).getName());
////			}
////			labels[i].setBounds(getWidth()/2-90,  getHeight()/2 - 150 - 20*(4-i), 400, 300);
////			labels[i].setFont(new Font("font", Font.PLAIN, 14));
////			add(labels[i], BorderLayout.CENTER);
////			labels[i].setAlignmentX(CENTER_ALIGNMENT);
////			labels[i].setVisible(true);
////		}
////		
//		congrats = new JLabel("Congrats! " + game.getWinner().getName() + " won!");
//		congrats.setBounds(getWidth()/2-90,  getHeight()/2 - 300 , 400, 400);
//		congrats.setFont(new Font("font", Font.PLAIN, 18));
//		add(congrats);
//		congrats.setAlignmentX(CENTER_ALIGNMENT);
//		congrats.setVisible(true);
//	
//
//		playAgain = new JButton("Play Again");
//		playAgain.setBounds(getWidth()/2-50, getHeight()/2 + 50, 100, 20);
//		add(playAgain, BorderLayout.CENTER);
//				
//        playAgain.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                playAgainActionPerformed(evt);
//            }
//        });
//		
//		setVisible(true);
//		sound.nextSong();
		
		String[] soundEffects = new String[]{"applause.mp3", "applause.mp3"};
		effects = new JComboBox<String>(soundEffects);
		add(effects);
		
		sound=new JayLayer("audio/","audio/",false);
		sound.addPlayList();
		sound.addSongs(0, soundEffects);
		sound.changePlayList(0);
		sound.addJayLayerListener(this);
		initComponents();
		sound.nextSong();
	}
	
	private void initComponents() {
//		winnerName = new javax.swing.JLabel();
//        winnerPoints = new javax.swing.JLabel();
//        winnerTime = new javax.swing.JLabel();
//        playAgain = new javax.swing.JButton();
//        endGame = new javax.swing.JButton();
//        jLabel1 = new javax.swing.JLabel();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        winnerName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
//        winnerName.setText("Winner Name: ");
//
//        winnerPoints.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
//        winnerPoints.setText("Points: ");
//
//        winnerTime.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
//        winnerTime.setText("Timestamp:");
//
//        playAgain.setText("Play Again");
//        playAgain.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                playAgainActionPerformed(evt);
//            }
//        });
//
//        endGame.setText("End Game");
//        endGame.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                endGameActionPerformed(evt);
//            }
//        });
//
//        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/skyla/Downloads/congratulations-typography-handwritten-lettering-greeting-card-banner_7081-766.png")); // NOI18N
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(34, 34, 34)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addComponent(winnerPoints)
//                        .addComponent(winnerTime))
//                    .addGroup(layout.createSequentialGroup()
//                        .addComponent(winnerName)
//                        .addGap(27, 27, 27)))
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                    .addGroup(layout.createSequentialGroup()
//                        .addContainerGap(80, Short.MAX_VALUE)
//                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(layout.createSequentialGroup()
//                        .addGap(38, 38, 38)
//                        .addComponent(playAgain)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(endGame)))
//                .addGap(58, 58, 58))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(28, 28, 28)
//                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(31, 31, 31)
//                .addComponent(winnerName)
//                .addGap(28, 28, 28)
//                .addComponent(winnerPoints)
//                .addGap(18, 18, 18)
//                .addComponent(winnerTime)
//                .addGap(48, 48, 48)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(playAgain)
//                    .addComponent(endGame))
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        pack();
		
		    winnerName = new javax.swing.JLabel();
	        winnerPoints = new javax.swing.JLabel();
	        winnerTime = new javax.swing.JLabel();
	        playAgain = new javax.swing.JButton();
	        endGame = new javax.swing.JButton();
	        jLabel1 = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        winnerName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
	        winnerName.setText("Name: " + game.getWinner().getName());

	        winnerPoints.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
	        winnerPoints.setText("Points: " + game.getWinner().getPoints());

	        winnerTime.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
	        winnerTime.setText("Timestamp: " + game.getWinner().getTime());

	        playAgain.setBackground(new java.awt.Color(255, 145, 255));
	        playAgain.setText("Play Again");
	        playAgain.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                playAgainActionPerformed(evt);
	            }
	        });

	        endGame.setBackground(new java.awt.Color(255, 88, 77));
	        endGame.setText("End Game");
	        endGame.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                endGameActionPerformed(evt);
	            }
	        });

	        setImage();

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap(69, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(winnerName)
	                    .addComponent(winnerPoints)
	                    .addComponent(winnerTime)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(playAgain)
	                        .addGap(87, 87, 87)
	                        .addComponent(endGame))
	                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(69, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap(28, Short.MAX_VALUE)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(30, 30, 30)
	                .addComponent(winnerName)
	                .addGap(24, 24, 24)
	                .addComponent(winnerPoints)
	                .addGap(27, 27, 27)
	                .addComponent(winnerTime)
	                .addGap(44, 44, 44)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(playAgain)
	                    .addComponent(endGame))
	                .addContainerGap(36, Short.MAX_VALUE))
	        );

	        pack();
	}
	
	private void playAgainActionPerformed(ActionEvent e) {
		sound.stopSong();
		setVisible(false);
		JFrame window = new AddPlayers();
		window.setVisible(true);
	}
	
	private void endGameActionPerformed(ActionEvent e) {
		System.exit(0);
	}


	@Override
	public void musicStarted() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void musicStopped() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void playlistEnded() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void songEnded() {
		// TODO Auto-generated method stub
		
	}
	
	 private void setImage() {
         URL file = ClassLoader.getSystemClassLoader().getResource(BALLOON_IMAGE);
         BufferedImage image=null;
         try {
			  image = ImageIO.read(file);
		   } catch (IOException e) {
			  // TODO Auto-generated catch block
			   e.printStackTrace();
		}
         ImageIcon icon = new ImageIcon(image);
         jLabel1.setIcon(icon);
	 }	
	 
	 public static void main(String args[]) {
	        /* Set the Nimbus look and feel */
	        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	         */
		    String[] names = {"Skyla", "Andria", "Lindsay", "Dave"};
		    List<String> playerNames = Arrays.asList(names);	
			 Game game = new Game(playerNames);
			 CardDeck deck = game.getCardDeck();
			 deck.shuffleDeck();
			 deck.shuffleDeck();
			 deck.shuffleDeck();
			 SavingCard.init();
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(EndingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(EndingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(EndingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(EndingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new EndingPage(game).setVisible(true);
	            }
	        });
	    }
}
