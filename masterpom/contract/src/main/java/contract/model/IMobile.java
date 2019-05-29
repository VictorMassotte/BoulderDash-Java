package contract.model;

import java.awt.Point;

import contract.controller.UserOrder;
import showboard.IPawn;

public interface IMobile extends IPawn, IElement {

	public void moveUp();

	public void moveDown();

	public void moveRight();

	public void moveLeft();

	public void doNothing();

	public int getX();

	public int getY();

	public boolean isAlive();

	public boolean isCrushed();

	public boolean canMoveTo(UserOrder direction);

	public Point getPosistion();

	public void removeFromBoard();

	public void followMyStrategy();

	public UserOrder getLastWellTouched();

	public void setLastWallTouched(UserOrder userOrder);

	public boolean isFalling();

}
