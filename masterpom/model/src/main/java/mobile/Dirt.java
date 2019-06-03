package mobile;

/**
 * <h1>The Class Dirt provides the code of the model component.</h1>
 * 
 * 
 * @author Thomas Lima
 * @version 1.0
 */

public class Dirt extends Sprite {

	private static final long serialVersionUID = 1L;

	public Dirt() {
		super();
		this.path = "dirt.png";
		this.setImage();
	}

	public String toString() {
		return "type:Dirt " + super.toString();
	}
}
