package motionless;

import java.awt.Rectangle;

import contract.model.Crossable;
import contract.model.Sprite;

public class Wall extends MotionLessElement {

	private static final Sprite sprite = new Sprite('X', Sprite.mapTileSet, new Rectangle(0, 0, 16, 16));
	
	public Wall() {
		super(sprite, Crossable.BLOCKING);
		
	}

}
