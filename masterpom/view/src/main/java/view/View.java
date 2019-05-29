package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.controller.IController;
import contract.controller.UserOrder;
import contract.model.IMap;
import contract.model.IMobile;
import contract.model.IModel;
import contract.view.IView;
import showboard.BoardFrame;


public final class View implements IView, Runnable {


    protected IMap map;
    protected IMobile Character;
    protected IMobile[] Pawns;
	private BoardFrame boardFrame = new BoardFrame("Boulder Dash");
	


	
	public View(IMap map, IMobile character, IMobile[] pawns) {
		super();
		this.map = map;
		Character = character;
		Pawns = pawns;
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

	
	public void run() {
		 
	}
    
	protected void setMap(IMap map) {
		this.map = map;
	}



	public void show() {
		
	}


	public void updateBoardFrame() {

	}

}	
