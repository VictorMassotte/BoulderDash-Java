package motionless;

import java.awt.Rectangle;

import contract.model.Permeability;
import contract.model.Sprite;

public class Dugdirt extends MotionLessElement {
	
	private static final Sprite sprite = new Sprite(' ', Sprite.mapTileSet, new Rectangle(32, 0, 16, 16));

	public void DugDirt() {
		super(sprite, Permeability.PENETRABLE);
	}

}

