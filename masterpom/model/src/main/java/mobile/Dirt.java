package mobile;

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
