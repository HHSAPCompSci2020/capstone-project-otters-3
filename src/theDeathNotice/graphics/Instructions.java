package theDeathNotice.graphics;

import javax.swing.*;

/**
 * The class representing the window or page of instructions.
 * This class has the instructions of the game for the players
 * to refer to.
 * 
 * @author Skyla
 * @version 1
 *
 */

public class Instructions {//extends JDialog implements ActionListener {
       String text="<html><body>" 
       		+ "<h4>Rule 1:</h4>"
    		+ "<p>sample text sample text sample test<br>" 
       		+ "sample text sample text sample test        <br>" 
       		+ "sample text sample text sample test =========<br>" 
       		+ "sample text sample text sample test   <br>" 
       		+ "sample text sample text sample test ===<br>" 
       		+ "sample text sample text sample test<br>" 
       		+ "sample text sample text sample test<br>" 
       		+ "sample text sample text sample test    <br>" 
       		+ "sample text sample text sample test   <br>" 
       		+ "sample text sample text sample test<br>" 
       		+ "sample text sample text sample test   <br>" 
       		+ "sample text sample text sample test</p>"
       		+ "<h4>Rule 2:</h4>"
    		+ "<p>sample text sample text sample test<br>" 
       		+ "sample text sample text sample test        <br>" 
       		+ "sample text sample text sample test =========<br>" 
       		+ "sample text sample text sample test   <br>" 
       		+ "sample text sample text sample test ===<br>" 
       		+ "sample text sample text sample test<br>" 
       		+ "sample text sample text sample test<br>" 
       		+ "sample text sample text sample test    <br>" 
       		+ "sample text sample text sample test   <br>" 
       		+ "sample text sample text sample test<br>" 
       		+ "sample text sample text sample test   <br>" 
       		+ "sample text sample text sample test</p>"
       		+ "</body></html>";
       
       /**
        * Initializes the page.
        * @param frame The MainGame JFrame that we use to open up this class.
        */
	   public Instructions(JFrame frame) {
		   JOptionPane.showMessageDialog(frame,
				    text,
				    "Please Read Game Instruction Carefully",
				    JOptionPane.INFORMATION_MESSAGE);
	   }
}