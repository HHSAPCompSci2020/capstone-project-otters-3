package theDeathNotice.graphics;

import java.awt.event.ActionEvent;
import java.text.MessageFormat;

import javax.swing.*;

import theDeathNotice.Card;
import theDeathNotice.CardDeck;
import theDeathNotice.Player;

/**
 * 
 * @author Skyla
 * @version 1
 * 
 * The class representing the window or page of instructions.
 * This class has the instructions of the game for the players
 * to refer to.
 *
 */
//private void instructionsButtonActionPerformed(ActionEvent evt) {
//	JFrame instruction = new Instructions();
//	instruction.setSize(270, 160); 
//	instruction.setVisible(true);
//    this.setVisible(false);
//    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
//    this.dispose();
//}

public class Instructions extends JFrame{
	
	private JTextField instruction;
	private JButton back;
	
	/**
	 * Initializes the page.
	 */
	public Instructions() {
		initComponents();
	}
	
	private void initComponents() {
		instruction = new JTextField(1000);
        instruction.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        instruction.setText("help");
        back = new javax.swing.JButton();
        back.setText("<html><center><b>Back</b></center></html>");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
	}	
	
	
	 private void backActionPerformed(ActionEvent evt) {
//		   TestJFrame jfrm1= new TestJFrame();
//	       jfrm1.setSize(270, 160); 
//	       jfrm1.setVisible(true);
//	        this.setVisible(false);
//	        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
//	        this.dispose();
	 }
}