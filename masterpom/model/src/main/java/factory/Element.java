package factory;

import java.awt.Image;

import contract.model.IElement;
import contract.model.Crossable;
import contract.model.Sprite;

public class Element implements IElement {
	
	private Sprite sprite;
	
	private Crossable crossable;

	public Element(final Sprite sprite, final Crossable crossable) {
		this.setSprite(sprite);
		this.setCrossable(crossable);
	}
	
	@Override
	public Sprite getSprite() {
		return this.sprite;
	}

	@Override
	public Crossable getCrossable() {
		return this.crossable;
	}

	@Override
	public Image getImage() {
		return this.getSprite().getImage();
	}

	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	public void setCrossable(Crossable crossable) {
		this.crossable = crossable;
	}
//s
}
