
package main;

import java.io.IOException;
import java.sql.SQLException;

import contract.main.IMain;
import controller.ControllerFenetre;
import controller.ControllerMenu;
import view.Fenetre;

public class Main implements IMain {

	private static Fenetre f = new Fenetre();

	public static void main(final String[] args) throws SQLException, IOException {

		ControllerFenetre c = new ControllerFenetre(f);
		ControllerMenu m = new ControllerMenu(f);

	}

}
