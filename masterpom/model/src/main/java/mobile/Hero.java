package mobile;

import contract.model.IHero;

public class Hero extends Sprite implements IHero {

	private static final long serialVersionUID = 1L;
	private Boolean alive = true;
	private int vy = -18;

	public Hero() {
		super();
		this.path = "hero.png";
		this.setImage();
	}

	public String toString() {
		return "type:Hero " + super.toString();
	}

	public void setAlive(Boolean bool) {
		this.alive = bool;
	}

	public Boolean getAlive() {
		return this.alive;
	}

	public void setVelocityY(int pVy) {
		this.vy = pVy;
	}

	public int getVelocityY() {
		return this.vy;
	}
}
