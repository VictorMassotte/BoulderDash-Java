package Strategy;

import contract.controller.IStrategy;
import contract.controller.UserOrder;
import contract.model.IMap;
import contract.model.IMobile;
import contract.model.Permeability;

public class FallingObjectStrategy implements IStrategy {

	public void followStrategy(IMobile currentPawn, IMap map) {

		if (currentPawn.canMoveTo(UserOrder.DOWN)) {
			currentPawn.moveDown();
		} else {

			for (IMobile pawnVerif : map.getPawns()) {

				if (currentPawn.getPosistion().y == pawnVerif.getPosistion().y - 1
						&& currentPawn.getPosistion().x == pawnVerif.getPosistion().x) {

					if (currentPawn.canMoveTo(UserOrder.LEFT)) {

						if (map.getSquarelsOccupied(pawnVerif.getPosistion().x - 1,
								pawnVerif.getPosistion().y) == Permeability.PENETRABLE) {
							currentPawn.moveLeft();
							return;
						}

					}

					if (currentPawn.canMoveTo(UserOrder.RIGHT)) {

						if (map.getSquarelsOccupied(pawnVerif.getPosistion().x + 1,
								pawnVerif.getPosistion().y) == Permeability.PENETRABLE) {
							currentPawn.moveRight();
							return;
						}
					}

				}
			}
			currentPawn.doNothing();
		}

	}

}
