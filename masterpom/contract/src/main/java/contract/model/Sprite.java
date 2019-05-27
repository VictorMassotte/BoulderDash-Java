package contract.model;

import java.awt.Image;

public class Sprite {

	private Image image;
	private String ImageName;
	private char consoleImage;
	private boolean imageLoaded;

	public Sprite(char character, String imageName) {

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
		return consoleImage;
	}

	private void setConsoleImage(char consoleImage) {
		this.consoleImage = consoleImage;
	}

	// -----------------------------------------------------------

	public String getImageName() {
		return ImageName;
	}

	private void setImageName(String imageName) {
		ImageName = imageName;
	}

	// -----------------------------------------------------------

	public boolean isImageLoaded() {
		return imageLoaded;
	}

	public void setImageLoaded(boolean imageLoaded) {
		this.imageLoaded = imageLoaded;
	}

	// -----------------------------------------------------------

	public void loadImage() {

	}

}
