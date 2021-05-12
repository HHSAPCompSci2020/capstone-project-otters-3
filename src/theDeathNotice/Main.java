package theDeathNotice;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;

import theDeathNotice.graphics.AddPlayers;
import theDeathNotice.graphics.EndingPage;
import theDeathNotice.graphics.MainGame;
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
		ArrayList<String> playerNames = new ArrayList<String>();
		ArrayList<String> s = new ArrayList<String>();
		s.add("hello");
		s.add("hi");
		s.add("another name");
		JFrame window = new EndingPage(s);

		window.setVisible(true);
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
		} catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        // Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGame(playerNames).setVisible(true);
            }
        });
	}
}
