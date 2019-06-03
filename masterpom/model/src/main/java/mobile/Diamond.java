package mobile;

/**
 * <h1>The Class Diamond provides the code of the model component.</h1>
 * 
 * 
 * @author Thomas Lima
 * @version 1.0
 */

public class Diamond extends Sprite {

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
