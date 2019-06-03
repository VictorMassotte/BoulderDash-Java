package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * <h1>The Class PanneauLogin provides the code of the model view.</h1>
 * 
 * 
 * @author Kevin Meffodong
 * @version 1.0
 */
public class PanneauLogin extends JPanel {
	private JTextField username;
	private JTextField password;
	private JButton button;
	private JLabel JUser;
	private JLabel pswd;
	private JPanel formulaire;

	public PanneauLogin() {
		super();
		this.setLayout(new GridBagLayout());
		username = new JTextField();
		password = new JTextField();
		JUser = new JLabel("User");
		pswd = new JLabel("Password");
		button = new JButton("OK");
		formulaire = new JPanel(new GridLayout(5, 1));
		formulaire.add(JUser);
		formulaire.add(username);
		formulaire.add(pswd);
		formulaire.add(password);
		formulaire.add(button);
		formulaire.setPreferredSize(new Dimension(150, 150));
		this.add(formulaire);
		this.setBackground(Color.black);

	}

	public JPanel getFormulaire() {
		return formulaire;
	}

	public JTextField getUsername() {
		return username;
	}

	public JTextField getPassword() {
		return password;
	}

	public JButton getButton() {
		return button;
	}

	public JLabel getJUser() {
		return JUser;
	}

	public JLabel getPswd() {
		return pswd;
	}

}
