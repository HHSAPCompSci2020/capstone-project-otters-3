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
    private JEditorPane typeName;
    private JLabel addPlayers;
    private JLabel enterName;
    private JScrollPane addName;
	
    /**
     * Initializes the page.
     */
	public AddPlayers() {
		super("Add Players");
		setSize(new Dimension(1000, 400));
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		typeName = new JEditorPane();
		typeName.setBounds(200, 200, 300, 100);

		doneButton = new JButton("Done");
		doneButton.setBounds(getX()+getWidth()/2-50, getY()+2*getHeight()/3-50, 100, 60);
		doneButton.addActionListener(this);
		
		add(doneButton);
		add(saveButton);
		add(typeName);
		add(addName);

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
		
	}
//	
	private void doneButtonActionPerformed(ActionEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == doneButton) {
			
		}
		
	}
	
}