package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.controller.IController;
import contract.controller.UserOrder;
import contract.model.IMap;
import contract.model.IMobile;
import contract.model.IModel;
import contract.view.IView;
import showboard.IPawn;

/**
 * The Class View.
 *
 * @author Jean-Aymeric Diet
 */
public final class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode the key code
	 * @return the controller order
	 */
	
	public void show() {
		this.viewFrame.setVisible(true);
	}
	
	protected static UserOrder keyCodeToUserOrder(int Code) {
		switch (Code) {
		case KeyEvent.VK_UP:
			return UserOrder.UP;
		case KeyEvent.VK_DOWN:
			return UserOrder.DOWN;
		case KeyEvent.VK_LEFT:
			return UserOrder.LEFT;
		case KeyEvent.VK_RIGHT:
			return UserOrder.RIGHT;
		default:
			return UserOrder.NONE;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */


	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		 viewFrame.requestFocus();
	}
    
	/**public View(IMap map, IMobile Character, IMobile []Pawns) { test

	}*/


	/**
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}

	public void updateBoardFrame() {
}

}	
