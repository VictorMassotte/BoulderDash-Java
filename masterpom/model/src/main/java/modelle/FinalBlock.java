package modelle;

/**
 * The FinalBlock is a class in model
 * 
 * @author Thomas Lima
 *
 */
public class FinalBlock extends Sprite {

	public FinalBlock(final int level) {
		super(level);

		for (int n = 0; n < 4; n++) {
			this.ximg[n] = 96;
		}

		this.setBreakable(false);
	}

}
