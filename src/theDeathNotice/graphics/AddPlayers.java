package theDeathNotice.graphics;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 
 * @author Andria
 * @version 1
 * 
 * This class represents the window or page for adding players.
 * In this class, you save 2-4 player names. Once you are finished 
 * saving names, click "Done". 
 *
 */
public class AddPlayers extends JFrame implements ActionListener {
	
	private JButton doneButton;
	private JButton saveButton;
    private JEditorPane jp;
//    private JLabel jLabel1;
//    private JLabel jLabel2;
    private JScrollPane jScrollPane;
	
    /**
     * Initializes the page.
     */
	public AddPlayers() {
		super("Add Players");
		setSize(new Dimension(1000, 400));
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		jp = new JEditorPane();
		jp.setBounds(200, 200, 300, 100);

		doneButton = new JButton("Done");
		doneButton.setBounds(getX()+getWidth()/2-50, getY()+2*getHeight()/3-50, 100, 60);
		doneButton.addActionListener(this);
		
		add(doneButton);
		add(saveButton);
		add(jp);
		add(jScrollPane);

		setVisible(true);
	}
	
//	private void initComponents() {
//		
//	}
//	
//	private void saveButtonActionPerformed() {
//		
//	}
//	
//	private void doneButtonActionPerformed() {
//		
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == doneButton) {
			
		}
		
	}
	
}