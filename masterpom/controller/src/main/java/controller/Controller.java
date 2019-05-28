package controller;

import contract.controller.IController;
import contract.controller.IOrderPerformer;
import contract.controller.UserOrder;
import contract.model.IModel;
import contract.view.IView;

/**
 * The Class Controller.
 */
public final class Controller implements IController, IOrderPerformer {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	private static int speed = 200;

	private UserOrder stackOrder;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view  the view
	 * @param model the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
		this.clearStackOrder();
	}

	//***SETTERS***//
	/**
	 * Control.
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage(
				"Appuyer sur les touches 'E', 'F', 'D' ou 'I', pour afficher Hello world dans la langue d votre choix.");
	}

	/**
	 * Sets the view.
	 *
	 * @param pview the new view
	 */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

    private void setStackOrder(final UserOrder stackOrder) {
        this.stackOrder = stackOrder;
    }
    
    
    //***GETTERS***//
	private IView getView() {
		return view;
	}

	private IModel getModel() {
		return model;
	}

    private UserOrder getStackOrder() {
        return this.stackOrder;
    }
	
    
    //***RAZ***//
    private void clearStackOrder() {
        this.stackOrder = UserOrder.NONE;
    }
    
	/**
	 * Order perform.
	 *
	 * @param controllerOrder the controller order
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */

	public void orderPerform(final UserOrder stackOrder) {
		this.setStackOrder(stackOrder);
		}
	
	public final void play()
	{
		switch (stackOrder) {
		case UP:
			// this.model.loadMoove("UP"); méthode à implémenter
			break;
		case DOWN:
			// this.model.loadMoove("DOWN");
			break;
		case RIGHT:
			// this.model.loadMoove("RIGHT");
			break;
		case LEFT:
			// this.model.loadMoove("LEFT");
			break;
		default:
			// this.model.loadMoove("NONE");
			break;
		}
	}
}

