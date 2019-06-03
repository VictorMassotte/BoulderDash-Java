package factory;

import mobile.Sprite;

/**
 * <h1>The Class Empty provides the code of the model component.</h1>
 * 
 * 
 * @author Victor Massotte
 * @version 1.0
 */

public class Empty extends Sprite {

	private static final long serialVersionUID = -8459095578519323906L;

	public Empty() {
		super();
		this.setImage();
	}

	public Empty(int pPosX, int pPosY) {
		super(pPosX, pPosY);
		this.setImage();
	}

	public String toString() {
		return "type:Dirt " + super.toString();
	}

}
