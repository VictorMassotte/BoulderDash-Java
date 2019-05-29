package mobile;

import java.awt.Rectangle;
import java.io.IOException;

import Strategy.DiamondStrategy;
import contract.controller.IStrategy;
import contract.model.IMap;
import contract.model.IMobile;
import contract.model.Crossable;
import contract.model.Sprite;

public class Diamond extends Mobile {

	private static Sprite sprite = new Sprite('D', Sprite.mapTitleSet, new Rectangle(64, 0, 16, 16));

	private static IStrategy strategy = new DiamondStrategy();

	public Diamond(int x, int y, IMap map) throws IOException {
		super(x, y, sprite, map, Crossable.MINEABLE);
		sprite.loadImage();
	}

	public void moveLeft() {
		super.moveLeft();
	}

	public void moveRight() {
		super.moveRight();
	}

	public void moveDown() {
		super.moveDown();
	}

	protected void die() {

	}

	public void doNothing() {
		super.doNothing();
	}

	public void followMyStrategy() {
		Diamond.strategy.followStrategy((IMobile) this, this.getMap());
	}

}
