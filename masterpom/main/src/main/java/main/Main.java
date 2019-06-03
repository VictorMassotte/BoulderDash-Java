
package main;

import java.io.IOException;
import java.sql.SQLException;

import contract.main.IMain;
import controller.ControllerFenetre;
import controller.ControllerMenu;
import view.Fenetre;

public class Main implements IMain {

	static int TILESIZE = 32;
	static int WIDTH = 16 * TILESIZE;
	static int HEIGHT = 16 * TILESIZE;
	static int OFFSETX = 0;
	static int OFFSETY = 0;
	private static Fenetre f = new Fenetre();

	public static void main(final String[] args) throws SQLException, IOException {

		/*
		 * En fonction du main Victor Window w = new Window("Boulder dash", WIDTH,
		 * HEIGHT);
		 * 
		 * w.init();
		 * 
		 * while (true) { w.update(); w.repaint();
		 * 
		 * }
		 */

		ControllerFenetre c = new ControllerFenetre(f);
		ControllerMenu m = new ControllerMenu(f);

	}

}
