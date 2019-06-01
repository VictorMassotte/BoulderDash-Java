package view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	private PanneauLogin login;
	private PanneauApp panneauAp;
	private CardLayout cl;
	
	
	public Fenetre() {
		super();
		login = new PanneauLogin();
		panneauAp = new PanneauApp();
		cl = new CardLayout();
		this.setLayout(cl);
		this.getContentPane().add("login", login);
		this.getContentPane().add("panneauAp", panneauAp);
		cl.show(this.getContentPane(), "login");
		this.setTitle("Boudler Dash");
		this.setSize(1000, 1000);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setVisible(true);
			
		
		}


	public PanneauLogin getLogin() {
		return login;
	}


	public PanneauApp getPanneauAp() {
		return panneauAp;
	}


	public CardLayout getCl() {
		return cl;
	}
	   public static void main(String args[]) {
		   Fenetre f = new Fenetre();
		   
	   }

}
