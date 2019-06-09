package modelle;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * The Hero is a class in model
 * 
 * @author Victor Massotte
 *
 */
public class Hero extends Sprite {

	private Image image;

	// ------------------------------------------------------------------------------

	public Hero(final int level) {
		super(level);

		for (int n = 0; n < 2; n++) {
			this.ximg[n] = 0;
		}

		for (int n = 0; n < 4; n++) {
			this.ximg[n] = 16;
		}

		for (int n = 0; n < 4; n++) {
			this.yimg[n] = 0;
		}
	}

	// ------------------------------------------------------------------------------

	public Image getImage() {
		return this.image;
	}

	public void setImage() {
		try {
			this.image = ImageIO.read(new File("player.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ------------------------------------------------------------------------------
	@Override
	public void setDirection(String direction) {
		int y = 0;

		switch (direction) {
		case "UP":
			y = 32;
			break;

		case "DOWN":
			y = 64;
			break;

		case "LEFT":
			y = 16;
			break;

		case "RIGHT":
			y = 48;
			break;

		case "DEATH":
			y = 80;

		case "WIN":
			y = 176;
		}

		for (int n = 0; n < 4; n++) {
			this.yimg[n] = y;
		}
	}

	// ------------------------------------------------------------------------------

}
