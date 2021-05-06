package suffocatingOtters;

import java.awt.Dimension;

import javax.swing.JFrame;


import suffocatingOtters.graphics.AddPlayers;
import suffocatingOtters.graphics.DrawingSurface;
import suffocatingOtters.graphics.StartPage;

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
