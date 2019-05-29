package factory;

import java.awt.Image;

import contract.model.IElement;
import contract.model.Crossable;
import contract.model.Sprite;

public class Element implements IElement {
	
	private Sprite sprite;
	
	private Crossable Crossable;

	public Element(final Sprite sprite, final Crossable Crossable) {
		this.setSprite(sprite);
		this.setCrossable(Crossable);
	}
	
	@Override
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Crossable getCrossable() {
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

	public void setCrossable(Crossable Crossable) {
		this.Crossable = Crossable;
	}

}
