package contract.model;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {

	private Image image;
	private char consoleImage;
	private boolean imageLoaded;
	private BufferedImage buffer;
	private Rectangle bufferPart;
	public static BufferedImage characterTileSet = null;
	public static BufferedImage mapTileSet = null;

	public Sprite(char character, BufferedImage imageBuffer, Rectangle part) {

		this.setConsoleImage(character);
		this.buffer = imageBuffer;
		bufferPart = part;

	}

	// -----------------------------------------------------------
	public Image getImage() {
		return this.image;
	}

	private void setImage(Image image) {
		this.image = image;
	}

	// -----------------------------------------------------------

	public char getConsoleImage() {
		return this.consoleImage;
	}

	private void setConsoleImage(char consoleImage) {
		this.consoleImage = consoleImage;
	}

	// -----------------------------------------------------------

	public boolean isImageLoaded() {
		return this.imageLoaded;
	}

	public void setImageLoaded(boolean isimageLoaded) {
		this.imageLoaded = isimageLoaded;
	}

	// -----------------------------------------------------------

	public void loadImage() {
		this.setImage(buffer.getSubimage(bufferPart.x, bufferPart.y, bufferPart.width, bufferPart.height));

	}

	// -------------------------------------------------------------

	public static void loadBuffers() {
		try {
			int randomNum = (int) (Math.random() * 6);
			Sprite.characterTileSet = ImageIO.read(new File("images/characterSet.png"));
			Sprite.mapTileSet = ImageIO.read(new File("images/mapSet.png"));
			Sprite.mapTileSet = Sprite.cropBuffer(Sprite.mapTileSet, randomNum);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	// --------------------------------------------------------------------------------------

	private static BufferedImage cropBuffer(BufferedImage src, int offset) {
		BufferedImage img = new BufferedImage(16 * 11, 16 * 4, BufferedImage.TYPE_INT_RGB);

		for (int currentXToWrite = 0; currentXToWrite < 16 * 11; currentXToWrite++) {
			for (int currentYToWrite = 0, currentYToRead = offset * 16 * 4; currentYToWrite < 16
					* 4; currentYToWrite++, currentYToRead++) {
				int color = src.getRGB(currentXToWrite, currentYToRead);
				img.setRGB(currentXToWrite, currentYToWrite, color);
			}
		}
		return img;
	}

}
