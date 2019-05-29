package contract.model;

import java.awt.Image;

import showboard.ISquare;

public interface IElement extends ISquare {

	public Sprite getSprite();

	public Crossable getCrossable();

	public Image getImage();

}
