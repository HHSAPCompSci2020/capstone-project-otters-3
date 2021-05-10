package theDeathNotice.graphics;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
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
public class AddPlayers extends JFrame {
    private static final int BUFFER_SIZE = 4096;
    private static final byte[] READ_BUFFER = new byte[BUFFER_SIZE];
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

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        addPlayers.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        addPlayers.setText("Add Players:");

        enterName.setText("Enter Player Name:");

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
//	
	private void saveButtonActionPerformed(ActionEvent e) {
		if (players.size() >= 4) {
			try {
				playSound();
				System.out.println("hihi!");
			} catch (UnsupportedAudioFileException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "There can only be a maximum of 4 players. The player was not added.");
		}
		if (typeName.getText().equals("")) {
			try {
				playSound();
				System.out.println("hihi!");
			} catch (UnsupportedAudioFileException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "Please type the player's name into the textbox.");
			return;
		} 
		boolean duplicate = false;
		for (String s : players) {
			if (s.equals(typeName.getText())) {
				duplicate = true;
			}
		}
		if (duplicate) {
			try {
				playSound();
			} catch (UnsupportedAudioFileException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "This player has already been registered.");
			return;
		}
		players.add(typeName.getText());
		typeName.setText("");
	}
//	
	private void doneButtonActionPerformed(ActionEvent e) {
		if (players.size() > 4) {
			try {
				playSound();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "You have too many players. The maximum number of players allowed is 4. Please exit the game and try again.");
		} else if (players.size() < 2) {
			try {
				playSound();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "You need at least 2 players to play. Please add more players.");
		} else {
			setVisible(false);
			JFrame window = new MainGame(players);
			window.setVisible(true);
		}
	}
	
	private void playSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		try { 
			File errorSound = new File("errorSound.wav");
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(errorSound);
			AudioFormat format = audioStream.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class, format);
			SourceDataLine audioLine = (SourceDataLine) AudioSystem.getLine(info);
			Clip audioClip = (Clip)AudioSystem.getLine(info);
			
			audioLine.open(format);
			audioLine.start();
			audioClip.open(audioStream);
			audioClip.start();
			audioClip.close();
			audioStream.close();
		} catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }   
	}
	
	public ArrayList<String> getPlayers() {
		return players;
	}
	
}