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
import theDeathNotice.Game;
import theDeathNotice.Player;

/**
 * @author Andria
 * @version 1.0
 * 
 * This class represents the last page.
 */

public class EndingPage extends JFrame implements JayLayerListener {
	private static final String BOLLOON_IMAGE = "images/bolloons.png";
	private JLabel congrats;
	private JLabel second;
	private JLabel third;
	private JLabel fourth;
	private JButton playAgain;
	
	private JayLayer sound;
	private JComboBox<String> effects;

	/**
	 * initializes the game
	 * @param game the completed game with the player standings
	 */
	public EndingPage(Game game) {
		super("Congratulations!");
		setSize(400, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		add(new JPanel());
		
		getContentPane().setBackground(new Color(145, 242, 145)); 
		
		String[] soundEffects = new String[]{"applause.mp3", "applause.mp3"};
		effects = new JComboBox<String>(soundEffects);
		add(effects);
		
		sound=new JayLayer("audio/","audio/",false);
		sound.addPlayList();
		sound.addSongs(0, soundEffects);
		sound.changePlayList(0);
		sound.addJayLayerListener(this);
		
		second = new JLabel();
		third = new JLabel();
		fourth = new JLabel();
		JLabel[] labels = new JLabel[] {null, second, third, fourth};
		String[] nums = new String[] {"1st", "2nd", "3rd", "4th"};
		
//		ArrayList<Player> playerStandings = game.getStandings();
		
//		for (int i = 1; i < 3; i++) {
//			if (i < playerStandings.size()) {
//				labels[i].setText(nums[i] + ": " + playerStandings.get(i).getName());
//			}
//			labels[i].setBounds(getWidth()/2-90,  getHeight()/2 - 150 - 20*(4-i), 400, 300);
//			labels[i].setFont(new Font("font", Font.PLAIN, 14));
//			add(labels[i], BorderLayout.CENTER);
//			labels[i].setAlignmentX(CENTER_ALIGNMENT);
//			labels[i].setVisible(true);
//		}
//		
		congrats = new JLabel("Congrats! " + game.getWinner().getName() + " won!");
		congrats.setBounds(getWidth()/2-90,  getHeight()/2 - 300 , 400, 400);
		congrats.setFont(new Font("font", Font.PLAIN, 18));
		add(congrats);
		congrats.setAlignmentX(CENTER_ALIGNMENT);
		congrats.setVisible(true);
	

		playAgain = new JButton("Play Again");
		playAgain.setBounds(getWidth()/2-50, getHeight()/2 + 50, 100, 20);
		add(playAgain, BorderLayout.CENTER);
				
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });
		
		setVisible(true);
		sound.nextSong();
	}
	
	
	private void playAgainActionPerformed(ActionEvent e) {
		sound.stopSong();
		setVisible(false);
		JFrame window = new AddPlayers();
		window.setVisible(true);
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
         URL file = ClassLoader.getSystemClassLoader().getResource(BOLLOON_IMAGE);
         BufferedImage image=null;
         try {
			  image = ImageIO.read(file);
		   } catch (IOException e) {
			  // TODO Auto-generated catch block
			   e.printStackTrace();
		}
         ImageIcon icon = new ImageIcon(image);
         congrats.setIcon(icon);
	 }	
}
