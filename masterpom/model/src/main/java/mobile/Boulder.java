package mobile;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;

import Strategy.BoulderStrategy;
import contract.controller.IStrategy;
import contract.controller.UserOrder;
import contract.model.Crossable;
import contract.model.IMap;
import contract.model.Sprite;

public abstract class Boulder extends Mobile {

	private static Sprite sprite = new Sprite('O', Sprite.mapTileSet, new Rectangle(48, 0, 16, 16));

	private static IStrategy strategy = new BoulderStrategy();

	public Boulder(int x, int y, IMap map) throws IOException {
		super(x, y, sprite, map, Crossable.BLOCKING);
		sprite.loadImage();
	}

	public void moveLeft() {
		super.moveLeft();
	}

	public void moveRight() {
		super.moveRight();
	}

	public void moveUp() {

	}

	public void moveDown() {
		super.moveDown();
	}

	protected void die() {

	}

	public final void doNothing() {
		super.doNothing();
	}

	public void followMyStrategy() {
		Boulder.strategy.followStrategy(this, this.getMap());
	}

	protected Boolean pawnsABooleanMovementTo(UserOrder direction) {
		Point desiredPosition = null;

		switch (direction) {
		case UP:
			desiredPosition = new Point(this.getX(), this.getY() - 1);

		case DOWN:
			desiredPosition = new Point(this.getX(), this.getY() + 1);

		case RIGHT:
			desiredPosition = new Point(this.getX() + 1, this.getY());

		case LEFT:
			desiredPosition = new Point(this.getX() - 1, this.getY());
		case NONE:

		default:
			return true;
		}

		if (this.getMap().getMyCharacter().getPosition().equals(desiredPosition)) {
			return false;
		} else {
			return super.pawnsAllowMovementTo(direction);
		}
	}

}
