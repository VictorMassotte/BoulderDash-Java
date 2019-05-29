package main;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import contract.controller.IController;
import contract.model.IModel;
import controller.Controller;
import model.Model;
import view.ViewFrame;

public abstract class Main {

	public static void main(final String[] args) throws SQLException, IOException {

		String id = JOptionPane.showInputDialog("Please input level of the map", 1);
		int idAwnser = Integer.parseInt(id);

		final IModel model = new Model(idAwnser);
		final ViewFrame view = new ViewFrame(model.getMap(), model.getMyCharacter(), model.getMap().getPawns());
		final IController controller = new Controller(view, model);

		view.setOrderPerformer(controller.getOrderPeformer());

		controller.start();

	}

}
