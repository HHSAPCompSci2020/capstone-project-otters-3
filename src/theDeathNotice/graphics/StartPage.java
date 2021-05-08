package theDeathNotice.graphics;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 
 * @author skyla and andria
 * @version 1
 * 
 * This class represents the window or page of the starting screen.
 * If you want to play the game, click the "Begin" button. 
 *
 */
public class StartPage extends JFrame implements ActionListener {
	
	private JButton startButton;

	/**
     * Initializes the page;
     * 
     */
    
	public StartPage() {
		super("Start Page");
		setSize(new Dimension(1000, 400));
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		JLabel gameName = new JLabel("The Death Notice");
		gameName.setBounds(getWidth()/2-85, getHeight()/3, 200, 50);
		gameName.setFont(new Font("Serif", Font.PLAIN, 24));

		
		startButton = new JButton("Play");
		startButton.setBounds(getX()+getWidth()/2-50, getY()+2*getHeight()/3-50, 100, 60);
		startButton.addActionListener(this);
		
		add(startButton);
		add(gameName);

		setVisible(true);
//		initComponents();
	}
	
//	private void initComponents() {
//	
//	}
//	
//	private void startButtonActionPerformed() {
//	
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton) {
			setVisible(false);
			JFrame window = new AddPlayers();
			window.setBounds(getX(), getY(), getWidth(), getHeight());
		}
		
	}	
	
}