package org.eclipse.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculetteFrame extends JFrame implements ActionListener {

	JButton boutonSomme = new JButton("+");
	JButton boutonMoins = new JButton("-");
	JButton boutonFois = new JButton("*");
	JButton boutonDiv = new JButton("/");
	JButton fermer = new JButton("Fermer");
	JLabel label1 = new JLabel("Valeur 1 :");
	JLabel label2 = new JLabel("Valeur 2 :");
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();

	public CalculetteFrame() {
		
	}
	
	public void showFrame() {
		setVisible(true);
		setSize(500, 400);
		setTitle("Calculette Frame");
		label1.setBounds(20, 20, 100, 20);
		label2.setBounds(20, 40, 100, 20);
		text1.setBounds(140, 20, 100, 20);
		text2.setBounds(140, 40, 100, 20);
		boutonSomme.setBounds(20, 60, 100, 20);
		boutonMoins.setBounds(140, 60, 100, 20);
		boutonFois.setBounds(20, 90, 100, 20);
		boutonDiv.setBounds(140, 90, 100, 20);
		fermer.setBounds(140, 180, 100, 20);
		add(boutonSomme);
		add(boutonMoins);
		add(boutonFois);
		add(boutonDiv);
		add(fermer);
		add(label1);
		add(label2);
		add(text1);
		add(text2);
		setLayout(null);
		boutonSomme.addActionListener(this);
		boutonMoins.addActionListener(this);
		boutonFois.addActionListener(this);
		boutonDiv.addActionListener(this);
		fermer.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Object source = e.getSource();
		if (e.getSource() == fermer) {
			dispose();
		} else {
			
			try {
				var val1 = Integer.parseInt(text1.getText());
				var val2 = Integer.parseInt(text2.getText());
				switch (e.getActionCommand()) {
				case "+" -> JOptionPane.showInternalMessageDialog(null, val1 + val2);
				case "-" -> JOptionPane.showInternalMessageDialog(null, val1 - val2);
				case "*" -> JOptionPane.showInternalMessageDialog(null, val1 * val2);
				case "/" -> JOptionPane.showInternalMessageDialog(null, val1 / val2);
				default -> JOptionPane.showInternalMessageDialog(null, "operateur inconnu");
				}
				text1.setText("");
				text2.setText("");
				
			} catch (Exception exception) {
				JOptionPane.showInternalMessageDialog(null, "Erreur: type de donnees non supporté");
			}
		}
//		if (source.equals(boutonSomme)) {
//			JOptionPane.showInternalMessageDialog(null, val1 + val2);
//		} else if (source.equals(boutonMoins)) {
//			JOptionPane.showInternalMessageDialog(null, val1 - val2);
//		} else if (source.equals(boutonFois)) {
//			JOptionPane.showInternalMessageDialog(null, val1 * val2);
//
//		} else if (source.equals(boutonDiv)) {
//			JOptionPane.showInternalMessageDialog(null, val1 / val2);
//		}

	}
}

// TODO: ajouter qch pour laisser les boutons désactivés tant que on n'a pas mis les valeurs dedans
