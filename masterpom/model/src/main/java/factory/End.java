package factory;

import mobile.Sprite;

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
