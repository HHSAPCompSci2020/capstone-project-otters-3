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
	private static final String DRIPPING_WATER_IMAGE = "images/drippingWater.png";
	private JButton startButton;
	private JLabel gameName;
	private javax.swing.JLabel jLabel1;

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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        startButton.setText("Begin!");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        
        gameName.setBackground(new java.awt.Color(255, 102, 102));
        gameName.setFont(new java.awt.Font("Libian SC", 0, 36)); // NOI18N
        gameName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameName.setText("The Death Notice");
        gameName.setOpaque(true);

        setImage();
     
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(gameName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gameName, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(startButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
	}

	private void startButtonActionPerformed(ActionEvent e) {
		setVisible(false);
		JFrame window = new AddPlayers();
		window.setBounds(getX(), getY(), getWidth(), getHeight());
	}

	 private void setImage() {
         URL file = ClassLoader.getSystemClassLoader().getResource(DRIPPING_WATER_IMAGE);
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
	
}