package motionless;

import java.awt.Rectangle;

import contract.model.Crossable;
import contract.model.Sprite;

public class Dugdirt extends MotionLessElement {
	
	private static final Sprite sprite = new Sprite('S', Sprite.mapTileSet, new Rectangle(32, 0, 16, 16));

	public Dugdirt() {
		super(sprite, Crossable.PENETRABLE);
	}

}

