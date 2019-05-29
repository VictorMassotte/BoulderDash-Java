package view;

import java.awt.Graphics;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.controller.IOrderPerformer;
import contract.model.IMap;
import contract.model.IMobile;
import contract.model.IModel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame viewFrame;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -998294702363713521L;


	 
	protected IMap map;
	protected IMobile myCharacter;
	protected IMobile [] Pawns;
	protected IOrderPerformer orderPerformer;
	protected IModel model;
	
	protected IMobile getMyCharacter() {
		return myCharacter;
	}

	protected void setMyCharacter(IMobile myCharacter) {
		this.myCharacter = myCharacter;
	}

	protected IOrderPerformer getOrderPerformer() {
		return orderPerformer;
	}

	protected void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

	protected IMap getMap() {
		return map;
	}

	protected void setMap(IMap map) {
		this.map = map;
	}

	protected void setPawns(IMobile[] pawns) {
		Pawns = pawns;
	}
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);

	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */

	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) 
			{e.printStackTrace();}
			model = (IModel) arg0;
			setMap(model.getMap());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());

	}


}