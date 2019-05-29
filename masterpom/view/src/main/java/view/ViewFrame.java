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

	/**

	 * The Class GenericView.</h1>

	 * 

	 * @author Tejesh Tailor

	 * @version 1.0

	 */
//Test
	public class ViewFrame implements IView  {
		   

		/** The Constant squareSize. */

		protected static final int squareSize = Toolkit.getDefaultToolkit().getScreenSize().width / 20;



		/** The map. */

		protected IMap map = null;



		/** The player's character. */

		protected IMobile myCharacter = null;

		/** The list of pawns. */

		protected ArrayList<IMobile> pawns = null;

		/** The close view on the player. */

		protected Rectangle closeView = null;

		/** The order performer. */

		protected IOrderPerformer orderPerformer = null;

		/** The BoardFrame. */

		protected final showboard.BoardFrame boardFrame = new showboard.BoardFrame("BoulderDash");

		public ViewFrame(IMap map, contract.model.IMobile myCharacter, ArrayList<contract.model.IMobile> pawns) {
		
		}



		public ViewFrame() {
			
		}



		/**

		 * Key code to user order.

		 *

		 * @param keyCode

		 *            the key code

		 * @return the user order

		 */

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

		/**

		 * Gets a reasonable size for the close view depending on the map.

		 * 

		 * @return A rectangle with reasonable dimensions

		 */

		protected Rectangle getPreferableViewPort() {

			int preferableWidth;

			int preferableHeight;



			// First let's find a reasonable width

			if ((int) (map.getWidth() * 0.75) > 10) {

				preferableWidth = 10;

			} else if ((int) (map.getWidth() * 0.75) < 5) {

				preferableWidth = map.getWidth();

			} else {

				preferableWidth = (int) (map.getWidth() * 0.75);

			}


			// Now the same with height

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


		/**

		 * Update the board frame and redraws squares.

		 */

		public void updateBoardFrame(){

			for (int x = 0; x < this.getMap().getWidth(); x++) {

				for (int y = 0; y < this.getMap().getHeight(); y++) {

					BoardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);

				}

			}

		}



		/**

		 * 

		 * @param newPawns

		 *            The pawn list.

		 */

		protected void setPawns(final ArrayList<IMobile> newPawns) {

			this.pawns = newPawns;

		}



	}
	
	

