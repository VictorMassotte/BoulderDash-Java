package controller;

import java.io.IOException;

import contract.controller.IController;
import contract.controller.IOrderPerformer;
import contract.controller.UserOrder;

public class Controller implements IController, IOrderPerformer{

    /** The Constant speed. */
    private static final int speed = 300;

    /** The view. */
    private IView  view;

    /** The model. */
    private IModel model;

    /** The stack order. */
    private UserOrder stackOrder;

    /**
     * Instantiates a new insane vehicles controller.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public Controller(final IView view, final IModel model) {
        this.setView(view);
        this.setModel(model);
        this.clearStackOrder();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.controller.IIinsaneVehiclesController#play()
     */
    @Override
    public final void play() throws InterruptedException {
        while (this.getModel().getMyCharac().isAlive()) {
            Thread.sleep(speed);
            switch (this.getStackOrder()) {
            case UP:
            	this.getModel().getMyCharac().moveUp();
                break;
            case DOWN:
            	this.getModel().getMyCharac().moveDown();
                break;
            case RIGHT:
            	this.getModel().getMyCharac().moveRight();
                break;
            case LEFT:
            	this.getModel().getMyCharac().moveLeft();
                break;
            case NONE:
            default:
            	this.getModel().getMyCharac().doNothing();
            	break;
            }
            this.clearStackOrder();
            if (this.getModel().getMyVehicle().isAlive()) {
                this.getModel().getMyVehicle().moveDown();
            }
            this.getView().followMyVehicle();
        }
        this.getView().displayMessage("CRASH !!!!!!!!!.");
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.controller.IOrderPerformed#orderPerform(fr.exia.insanevehicles.
     * controller.UserOrder)
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.controller.IIinsaneVehiclesController#orderPerform(fr.exia.
     * insanevehicles.controller.UserOrder)
     */
    @Override
    public final void orderPerform(final UserOrder userOrder) throws IOException {
        this.setStackOrder(userOrder);
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    private IView getView() {
        return this.view;
    }

    /**
     * Sets the view.
     *
     * @param view
     *            the view to set
     */
    private void setView(final IView view) {
        this.view = view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    private IModel getModel() {
        return this.model;
    }

    /**
     * Sets the model.
     *
     * @param model
     *            the model to set
     */
    private void setModel(final IModel model) {
        this.model = model;
    }

    /**
     * Gets the stack order.
     *
     * @return the stack order
     */
    private UserOrder getStackOrder() {
        return this.stackOrder;
    }

    /**
     * Sets the stack order.
     *
     * @param stackOrder
     *            the new stack order
     */
    private void setStackOrder(final UserOrder stackOrder) {
        this.stackOrder = stackOrder;
    }

    /**
     * Clear stack order.
     */
    private void clearStackOrder() {
        this.stackOrder = UserOrder.NONE;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.controller.IIinsaneVehiclesController#getOrderPeformer()
     */
    @Override
    public IOrderPerformer getOrderPeformer() {
        return this;
    }

}
