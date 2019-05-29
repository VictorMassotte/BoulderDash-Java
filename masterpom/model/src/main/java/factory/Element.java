package factory;

import java.awt.Image;

import contract.model.IElement;
import contract.model.Permeability;
import contract.model.Sprite;

public class Element implements IElement {
	
	private Sprite sprite;
	
	private Permeability permeability;

	public Element(final Sprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}
	
	@Override
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permeability getPermeability() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

}
