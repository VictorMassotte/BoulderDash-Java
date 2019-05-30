package mobile;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import contract.main.IMain;
import contract.model.ISprite;

public class Sprite extends JPanel implements ISprite {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int posX = 0;
	protected int posY = 0;
	protected String path = "empty.png";
	protected Boolean isSolid = false;
	protected Boolean isMoveable = false;
	protected Boolean isActive = true;
	protected Image img;
	protected int speed = 0;
	protected int time = 0;

	public Sprite() {
		this.setSize(IMain.WIDTH, IMain.HEIGHT);
	}

	public Sprite(String pPath, int pPosX, int pPosY) {
		this.posX = pPosX;
		this.posY = pPosY;
		this.path = pPath;
		this.setSize(IMain.WIDTH, IMain.HEIGHT);
	}

	public Sprite(int pPosX, int pPosY) {
		this.posX = pPosX;
		this.posY = pPosY;
		this.setSize(IMain.WIDTH, IMain.HEIGHT);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(this.img, this.posX - IMain.OFFSETX, this.posY - IMain.OFFSETY, IMain.TILESIZE, IMain.TILESIZE,
				this);
	}

	public String toString() {
		return "x:" + posX + " y:" + posY;
	}

	public void setImage() {
		try {
			this.img = ImageIO.read(new File(this.path));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	public void setPosX(int pX) {
		this.posX = pX;
	}

	public void setPosY(int pY) {
		this.posY = pY;
	}

	public void setIsSolid(Boolean pBool) {
		this.isSolid = pBool;
	}

	public void setPath(String pPath) {
		this.path = pPath;
	}

	public void setSpeed(int pSpeed) {
		this.speed = pSpeed;
	}

	public int getPosX() {
		return this.posX;
	}

	public int getPosY() {
		return this.posY;
	}

	public Boolean getIsSolid() {
		return this.isSolid;
	}

	public int getSpeed() {
		return this.speed;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}
}
