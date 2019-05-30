package mobile;

public class Diamond extends Sprite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Diamond() {
		super();
		this.path = "diamond.png";
		this.setImage();
	}

	public String toString() {
		return "type:Diamond " + super.toString();
	}
}
