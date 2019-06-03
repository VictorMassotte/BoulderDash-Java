package factory;

import mobile.Sprite;

abstract
/**
 * <h1>The Class End provides the code of the model component.</h1>
 * 
 * 
 * @author Victor Massotte
 * @version 1.0
 */

public class End extends Sprite {

	private static final long serialVersionUID = 1L;

	public End() {
		super();
		this.path = "block.png";
		this.isSolid = true;
		this.setImage();
	}

	public String toString() {
		return "type:End" + super.toString();
	}
}
