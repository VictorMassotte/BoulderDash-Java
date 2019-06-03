package mobile;

/**
 * <h1>The Class Rock provides the code of the model component.</h1>
 * 
 * 
 * @author Thomas Lima
 * @version 1.0
 */

public class Rock extends Sprite {

	private static final long serialVersionUID = 1L;

	public Rock() {
		super();
		this.path = "rock.png";
		this.isSolid = true;
		this.isMoveable = true;
		this.setImage();
	}

	public Rock(int pPosX, int pPosY) {
		super(pPosX, pPosY);
		this.path = "rock.png";
		this.isSolid = true;
		this.isMoveable = true;
		this.setImage();
	}

	public String toString() {
		return "type:Rock " + super.toString();
	}
}
