package view;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import contract.controller.IOrderPerformer;
import contract.controller.UserOrder;
import contract.model.IMap;
import contract.model.IMobile;
import contract.view.IView;
import showboard.BoardFrame;


	public class ViewFrame implements IView  {
		   



		protected static final int squareSize = Toolkit.getDefaultToolkit().getScreenSize().width / 20;


		protected IMap map = null;


		protected IMobile myCharacter = null;

		protected ArrayList<IMobile> pawns = null;


		protected Rectangle closeView = null;


		protected IOrderPerformer orderPerformer = null;


		protected final showboard.BoardFrame boardFrame = new showboard.BoardFrame("BoulderDash");

		public ViewFrame(IMap map, contract.model.IMobile myCharacter, ArrayList<contract.model.IMobile> pawns) {
		
		}



		public ViewFrame() {
			
		}



		protected static UserOrder keyCodeToUserOrder(final int keyCode) {

			UserOrder userOrder;

			switch (keyCode) {

			case KeyEvent.VK_RIGHT:

				userOrder = UserOrder.RIGHT;

				break;

			case KeyEvent.VK_LEFT:

				userOrder = UserOrder.LEFT;

				break;

			case KeyEvent.VK_UP:

				userOrder = UserOrder.UP;

				break;

			case KeyEvent.VK_DOWN:

				userOrder = UserOrder.DOWN;

				break;

			default:

				userOrder = UserOrder.NONE;

				break;

			}
			return userOrder;
		}



		protected <IMobile> void setMyCharacter(final contract.model.IMobile newCharacter) {

			this.myCharacter = newCharacter;

		}



		protected IMobile getMyCharacter() {

			return this.myCharacter;

		}



		protected void setCloseView(final Rectangle newView) {

			this.closeView = newView;

		}


		protected Rectangle getPreferableViewPort() {

			int preferableWidth;

			int preferableHeight;



			if ((int) (map.getWidth() * 0.75) > 10) {

				preferableWidth = 10;

			} else if ((int) (map.getWidth() * 0.75) < 5) {

				preferableWidth = map.getWidth();

			} else {

				preferableWidth = (int) (map.getWidth() * 0.75);

			}



			if ((int) (map.getHeight() * 0.75) > 10) {

				preferableHeight = 10;

			} else if ((int) (map.getHeight() * 0.75) < 5) {

				preferableHeight = map.getHeight();

			} else {

				preferableHeight = (int) (map.getHeight() * 0.75);

			}


			return new Rectangle(0, 0, preferableWidth, preferableHeight);

		}



		protected IMap getMap() {

			return this.map;

		}


		public Rectangle getCloseView() {

			return closeView;

		}


		protected IOrderPerformer getOrderPerformer() {

			return this.orderPerformer;

		}


		public void setOrderPerformer(final IOrderPerformer newPerformer) {

			this.orderPerformer = newPerformer;

		}


		public void updateBoardFrame(){

			for (int x = 0; x < this.getMap().getWidth(); x++) {

				for (int y = 0; y < this.getMap().getHeight(); y++) {

					BoardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);

				}

			}

		}


		protected void setPawns(final ArrayList<IMobile> newPawns) {

			this.pawns = newPawns;

		}



	}
	
	

