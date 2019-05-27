package contract;

import java.awt.Image;

import showboard.ISquare;

public interface IElement extends ISquare {

	public Sprite getSprite();

	public Permeability getPermeability();

	public Image getImage();

}
