package mobile;

import contract.model.IBlock;

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
