package modelle;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * The Sprite is a class in model
 * 
 * @author Victor Massotte
 *
 */
public abstract class Sprite {

	private Image image;
	public int ximg[];
	public int yimg[];
	public String direction;

	private boolean breakable;
	private boolean lootable;
	private boolean fall;
	private boolean falling;
	private boolean fixed;
	private boolean update;

	public Sprite(final int level) {
		ximg = new int[4];
		yimg = new int[4];
		setImage();
		setLevel(level);
		breakable = true;
		lootable = false;
		fall = false;
		falling = false;
		fixed = true;
		update = false;
		direction = "DOWN";

	}

	// --------------------------------------------

	public void setImage() {
		try {
			this.image = ImageIO.read(new File("sprite.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getImage() {
		return this.image;
	}

	// --------------------------------------------

	public void setLevel(int level) {
		for (int n = 0; n < 4; n++) {
			this.yimg[n] = (level - 1) * 64 + 16 * n;
		}
	}

	// --------------------------------------------

	public void setBreakable(boolean breakable) {
		this.breakable = breakable;
	}

	public boolean getBreakable() {
		return breakable;
	}

	// --------------------------------------------

	public void setLootable(boolean lootable) {
		this.lootable = lootable;
	}

	public boolean getLootable() {
		return this.lootable;
	}

	// --------------------------------------------

	public void setFall(boolean fall) {
		this.fall = fall;
	}

	public boolean getFall() {
		return fall;
	}

	// --------------------------------------------

	public void setFalling(boolean falling) {
		this.falling = falling;
	}

	public boolean getFalling() {
		return falling;
	}

	// --------------------------------------------

	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

	public boolean getFixed() {
		return fixed;
	}

	// --------------------------------------------

	public void setUpdate(boolean update) {
		this.update = update;
	}

	public boolean getUpdate() {
		return update;
	}

	// --------------------------------------------

	public void setDirection(String direction) {
		this.direction = direction;
	}

	// --------------------------------------------

}
