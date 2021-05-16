package theDeathNotice.graphics;
import java.awt.event.ActionEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;


import javax.swing.*;

import javazoom.jl.decoder.JavaLayerException;
//import jay.jaysound.JayLayer;
//import jay.jaysound.JayLayerListener;

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
public class AddPlayers extends JFrame {
	//private JayLayer sound;
	//private JComboBox<String> effects;
	
	private JButton doneButton;
	private JButton saveButton;
    private JEditorPane typeName;
    private JLabel addPlayers;
    private JLabel enterName;
    private JScrollPane addName;
    private ArrayList<String> players;
	
    /**
     * Initializes the page.
     */
	public AddPlayers() {
		super("Add Players");
		initComponents();
		players = new ArrayList<String>();
		setVisible(true);
		
//		String[] soundEffects = new String[]{"errorSound.mp3"};
//		effects = new JComboBox<String>(soundEffects);
//		add(effects);
//		
//		sound=new JayLayer("audio/","audio/",false);
//		sound.addPlayList();
//		sound.addSoundEffects(soundEffects);
//		sound.changePlayList(0);
//		sound.addJayLayerListener(this);
	}
	
	private void initComponents() {
		addName = new javax.swing.JScrollPane();
        typeName = new javax.swing.JEditorPane();
        doneButton = new javax.swing.JButton();
        addPlayers = new javax.swing.JLabel();
        enterName = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addName.setViewportView(typeName);

        
        doneButton.setBackground(new java.awt.Color(255, 145, 255));
        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        addPlayers.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        addPlayers.setText("<html><center><b>Add Players</b><center></html>");

        enterName.setText("Enter Player Name:");

        saveButton.setBackground(new java.awt.Color(255, 88, 77));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPlayers)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterName)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveButton)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doneButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(addPlayers)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enterName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addName, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButton)
                    .addComponent(saveButton))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        pack();
	}
	
//	 private void playSound() {
//			sound.playSoundEffect(0);
//			sound=new JayLayer("audio/","audio/",false);
//			String[] soundEffects = new String[]{"errorSound.mp3"};
//			effects = new JComboBox<String>(soundEffects);
//			add(effects);
//			
//			sound=new JayLayer("audio/","audio/",false);
//			sound.addPlayList();
//			sound.addSoundEffects(soundEffects);
//			sound.changePlayList(0);
//			sound.addJayLayerListener(this);
//	 }
	 
	 private void playSound() {
         URL file = ClassLoader.getSystemClassLoader().getResource("audio/errorSound.mp3");
			try {
				BufferedInputStream bs = new BufferedInputStream(file.openStream());
				javazoom.jl.player.Player player = new javazoom.jl.player.Player(bs);
				player.play();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 
//	
	private void saveButtonActionPerformed(ActionEvent e) {
		if (players.size() >= 4) {
			playSound();
			
			JOptionPane.showMessageDialog(this, "There can only be a maximum of 4 players. The player was not added.");
			return;
		}
		if (typeName.getText().equals("")) {
			playSound();
			JOptionPane.showMessageDialog(this, "Please type the player's name into the textbox.");
			return;
		} 
		int len = typeName.getText().length();
		if (len > 15) {
            playSound();
			JOptionPane.showMessageDialog(this, "Player name can not exceed 15 characters.");
			return;		
		}
		for (int i=0; i<len; i++) {
			if (Character.isLetterOrDigit(typeName.getText().charAt(i)) == false) {
                playSound();
				JOptionPane.showMessageDialog(this, "Player name can only contain alphabetic or digit character.");
				return;
			}
		}
		
		boolean duplicate = false;
		for (String s : players) {
			if (s.equals(typeName.getText())) {
				duplicate = true;
			}
		}
		if (duplicate) {
	        playSound();
			
			typeName.setText("");
			JOptionPane.showMessageDialog(this, "This player has already been registered.");
			return;
		}
		players.add(typeName.getText());
		typeName.setText("");
	}
//	
	private void doneButtonActionPerformed(ActionEvent e) {
		if (players.size() > 4) {
			playSound();
			JOptionPane.showMessageDialog(this, "You have too many players. The maximum number of players allowed is 4. Please exit the game and try again.");
		} else if (players.size() < 2) {
			playSound();
			JOptionPane.showMessageDialog(this, "You need at least 2 players to play. Please add more players.");
		} else {
			setVisible(false);
			JFrame window = new MainGame(players);
			window.setVisible(true);
		}
	}

//	@Override
//	public void musicStarted() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	public void musicStopped() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	public void playlistEnded() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	public void songEnded() {
//		// TODO Auto-generated method stub
//		
//	}
	
}