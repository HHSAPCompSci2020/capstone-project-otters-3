package theDeathNotice;

import java.awt.Dimension;

import javax.swing.JFrame;

import theDeathNotice.graphics.AddPlayers;
import theDeathNotice.graphics.StartPage;

/**
 * 
 * This class is the main class.
 * @author Andria
 * @version 1
 *
 */
public class Main{
	public static void main(String args[]) {
		JFrame window = new StartPage();

		window.setVisible(true);
	}
}
