package main;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import contract.controller.IController;
import contract.model.IModel;
import contract.view.IView;
import controller.Controller;
import view.ViewFrame;



/**

 * <h1>The Class Main.</h1>

 * @author Tejesh Tailor

 *

 */

public abstract class Main {
    /**

     * This is the main method.

     *

     * @param args

     *            the arguments

     * @throws SQLException 

     * @throws IOException 

     */

    public static void main(final String[] args) throws SQLException, IOException {

    	

    	String idToAsk= JOptionPane.showInputDialog("Choose your input id of the map : ", 1);

        int idAsked = Integer.parseInt(idToAsk);

        

    	final IModel model = new IModel(idAsked);

    	final ViewFrame view = new ViewFrame(model.getMap(), model.getMyCharacter(), model.getMap().getPawns());

        final IController controller = new Controller(view, model);

        view.setOrderPerformer(controller.getOrderPeformer());



        try {

            controller.start();

        } catch (InterruptedException e) {

        	System.out.println(e.getMessage());

			e.printStackTrace();

		}

    }

}
}