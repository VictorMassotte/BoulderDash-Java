package motionless;

import java.awt.Rectangle;

import contract.model.Crossable;
import contract.model.Sprite;

public class Filleddirt extends MotionLessElement {

	private static final Sprite sprite = new Sprite('H', Sprite.mapTileSet, new Rectangle(16, 0, 16, 16));
	
	public Filleddirt() {
		super(sprite, Crossable.MINEABLE);
	}

}
