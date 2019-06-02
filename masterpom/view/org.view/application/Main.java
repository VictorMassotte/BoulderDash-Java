package application;

import contract.main.IMain;
import controller.ControllerFenetre;
import controller.ControllerMenu;
import view.Fenetre;

public class Main implements IMain {
	
	private static  Fenetre f = new Fenetre();
    
	
	public static void main(String[] args) {
		  
			   ControllerFenetre  c = new ControllerFenetre(f);
			   ControllerMenu m = new ControllerMenu(f);
		   }


	}



