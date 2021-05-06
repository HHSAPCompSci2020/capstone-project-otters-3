package theDeathNotice;

import java.awt.Dimension;

import javax.swing.JFrame;

import theDeathNotice.graphics.AddPlayers;
import theDeathNotice.graphics.DrawingSurface;
import theDeathNotice.graphics.StartPage;

/**
 * 
 * @author Andria
 * @version 1
 *
 */
public class Main extends JFrame{
	public static void main(String args[]) {
		DrawingSurface drawing = new DrawingSurface();
		JFrame window = new StartPage();

		window.setSize(400, 300);
		window.setMinimumSize(new Dimension(100,100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);

		window.setVisible(true);
	}
}
