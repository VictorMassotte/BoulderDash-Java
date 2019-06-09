package modelle;

/**
 * The Wall is a class in model
 * 
 * @author Thomas Lima
 *
 */
public class Wall extends Sprite {

	public Wall(final int level) {
		super(level);

		for (int n = 0; n < 4; n++) {
			this.ximg[n] = 0;
		}

		this.setBreakable(false);
	}

	@Override
	public void setLevel(int level) {
		for (int n = 0; n < 4; n++) {
			this.yimg[n] = (level - 1) * 64;
		}
	}

}
