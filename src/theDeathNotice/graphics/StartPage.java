package theDeathNotice.graphics;


import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * 
 * @author Andria
 * @version 1
 * 
 * This class represents the window or page of the starting screen.
 * If you want to play the game, click the "Begin" button. 
 *
 */
public class StartPage extends JFrame {
	private static final String ARROW_IMAGE = "images/arrow.png";
	private JButton startButton;
	private JLabel gameName;

	/**
     * Initializes the page.
     * 
     */
    
	public StartPage() {
		super("Start Page");
		initComponents();
	}
	
	private void initComponents() {
		gameName = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gameName.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        gameName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameName.setText("<html><center><b>The Death Notice</b></center></html>");
        setImage();
        
        startButton.setBackground(new java.awt.Color(51, 153, 255));
        startButton.setForeground(new java.awt.Color(204, 0, 0));
        startButton.setOpaque(true);
        startButton.setText("<html><center><b>Begin!</b></center></html>");
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
               // .addComponent(gameName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(gameName, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                //.addComponent(gameName, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(gameName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(startButton)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();	
	}

	private void startButtonActionPerformed(ActionEvent e) {
		setVisible(false);
		JFrame window = new AddPlayers();
		window.setBounds(getX(), getY(), getWidth(), getHeight());
	}

	 private void setImage() {
         URL file = ClassLoader.getSystemClassLoader().getResource(ARROW_IMAGE);
         BufferedImage image=null;
         try {
			  image = ImageIO.read(file);
		   } catch (IOException e) {
			  // TODO Auto-generated catch block
			   e.printStackTrace();
		}
         ImageIcon icon = new ImageIcon(image);
         gameName.setIcon(icon);
	 }
	
}