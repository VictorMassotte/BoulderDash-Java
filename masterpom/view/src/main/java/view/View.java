package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IModel;
import contract.IView;
import controller.Controller;

/**
 * 
 * The Class View.
 *
 * 
 * 
 * @author Kevin Meffodong
 * 
 */

public final class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;
	// -------------------------------------------------------------------------

	// Place the view and its events in a thread that distributes tasks in their
	// respective components and invokes their display methods
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}
	// -------------------------------------------------------------------------

	// The hero movements
	protected static ControllerOrder keyControllerOrder(final int keyCode) {

		switch (keyCode) {
		case KeyEvent.VK_UP:
			return ControllerOrder.UP;

		case KeyEvent.VK_RIGHT:
			return ControllerOrder.RIGHT;

		case KeyEvent.VK_DOWN:
			return ControllerOrder.DOWN;

		case KeyEvent.VK_LEFT:
			return ControllerOrder.LEFT;

		}
		return null;

	}
	// -------------------------------------------------------------------------

	// This method show us the pop-up that will ask us to choice the map

	public void printMessage(final String messagelevel, final String messagemap) {
		this.viewFrame.printMessage(messagelevel, messagemap);
	}

	// -------------------------------------------------------------------------

	public void run() {
		this.viewFrame.setVisible(true);
	}

	// -------------------------------------------------------------------------

	public void setController(final Controller controller) {
		this.viewFrame.setController(controller);
	}

}
