package Strategy;

import contract.model.IMap;
import contract.model.IMobile;

public class DiamondStrategy extends FallingObjectStrategy {

	public void followStrategy(IMobile currentPawn, IMap map) {
		if ((currentPawn.getPosition().y == map.getMyCharacter().getPosition().y - 1
				&& currentPawn.getPosistion().x == map.getMyCharacter().getPosition().x)
				|| currentPawn.getPosistion().equals(map.getMyCharacter().getPosition())) {
			currentPawn.removeFromBoard();
			map.decreaseDiamondCount();
			return;
		}
		super.followStrategy(currentPawn, map);
	}

}
