package mobile;

import contract.model.IBlock;

/**
 * <h1>The Class Block provides the code of the model component.</h1>
 * 
 * 
 * @author Thomas Lima
 * @version 1.0
 */

public class Block extends Sprite implements IBlock {

	public Block() {
		super();
		this.path = "block.png";
		this.isSolid = true;
		this.setImage();
	}

	public String toString() {
		return "type:Block " + super.toString();
	}

}
