package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.Fenetre;

/**
 * <h1>The Class ControllerFenetre provides the code of the model view.</h1>
 * 
 * 
 * @author Kevin Meffodong
 * @version 1.0
 */

public class ControllerFenetre implements ActionListener {

	private Fenetre f;

	public ControllerFenetre(Fenetre fenetre) {
		super();
		this.f = fenetre;
		fenetre.getLogin().getButton().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String[] LoginStock = new String[2];

		LoginStock[0] = f.getLogin().getUsername().getText();

		LoginStock[1] = f.getLogin().getPassword().getText();

		if (LoginStock[0].isEmpty() || LoginStock[1].isEmpty()) {
			JOptionPane.showMessageDialog(null, "Empty champs", "Invalid Username or Password",
					JOptionPane.ERROR_MESSAGE);

		}
		if (!LoginStock[0].equals("user")) {
			JOptionPane.showMessageDialog(null, "Invalid username", "Invalid Username ", JOptionPane.ERROR_MESSAGE);
		}
		if (!LoginStock[1].equals("user")) {
			JOptionPane.showMessageDialog(null, "Invalid password", "Invalid  Password", JOptionPane.ERROR_MESSAGE);
		}
		if (LoginStock[0].equals("user") && LoginStock[1].equals("user")) {
			f.getCl().next(f.getContentPane());
		}
	}

}
