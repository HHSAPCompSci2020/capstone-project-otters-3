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
public class StartPage extends JFrame {
	
	private JButton startButton;
	private JLabel gameName;

	/**
     * Initializes the page;
     * 
     */
    
	public StartPage() {
		super("Start Page");
		initComponents();
//		setSize(new Dimension(1000, 400));
//		setLayout(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setResizable(false);
//		
//		JLabel gameName = new JLabel("The Death Notice");
//		gameName.setBounds(getWidth()/2-85, getHeight()/3, 200, 50);
//		gameName.setFont(new Font("Serif", Font.PLAIN, 24));
//
//		
//		startButton = new JButton("Play");
//		startButton.setBounds(getX()+getWidth()/2-50, getY()+2*getHeight()/3-50, 100, 60);
////		startButton.addActionListener(this);
//		
//		add(startButton);
//		add(gameName);
//
//		setVisible(true);
//		initComponents();
	}
	
	private void initComponents() {
		gameName = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gameName.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        gameName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameName.setText("The Death Notice");

        startButton.setText("Begin!");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(startButton)
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gameName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(gameName, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(startButton)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();	
	}
//	
	private void startButtonActionPerformed(ActionEvent e) {
		setVisible(false);
		JFrame window = new AddPlayers();
		window.setBounds(getX(), getY(), getWidth(), getHeight());
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == startButton) {
//
//		}
//		
//	}	
	
}