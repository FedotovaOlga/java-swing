package org.eclipse.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame; // les imports ce sera javax
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Firstframe extends JFrame implements ActionListener {
	// Widget : commentcent par J
	JButton bouton = new JButton("Afficher");
	JLabel label = new JLabel("Votre nom");
	JTextField text = new JTextField();
	
	public Firstframe() {
		setVisible(true);
		setSize(500, 400);
		setTitle("First frame");
		label.setBounds(20, 20, 100, 20);
		text.setBounds(140, 20, 100, 20);
		bouton.setBounds(140, 60, 100, 20);
		add(bouton);
		add(label);
		add(text);
		setLayout(null);
		bouton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Exécuter en cliquant sur le bouton
		var nom = text.getText();
		var message = "Bonjour " + nom;
		JOptionPane.showInternalMessageDialog(null, message);
		text.setText(""); // vide le champ apres ok sur pop-up
	}

}
