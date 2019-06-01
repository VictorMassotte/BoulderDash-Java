package application;

import controller.ControllerFenetre;
import controller.ControllerMenu;
import view.Fenetre;
import view.PanneauApp;
import view.PanneauMenu;

public class Main {
	
	private static  Fenetre f = new Fenetre();
    
	
	public static void main(String[] args) {
		  
			   ControllerFenetre  c = new ControllerFenetre(f);
			   ControllerMenu m = new ControllerMenu(f);
		   }


	}


