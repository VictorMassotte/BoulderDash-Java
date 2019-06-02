package factory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import mobile.Sprite;

public class Explode extends Sprite {

	private static final long serialVersionUID = 1L;
	private Timer timer;
	private int time = 1000;

	public Explode() {
		super();
		this.path = "explode.png";
		this.setImage();
	}

	public Explode(int pX, int pY) {
		super(pX, pY);
		this.path = "explode.png";
		this.setImage();

		timer = new Timer(16, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (time <= 0) {
					isActive = false;
				} else {
					time -= 16;
				}
			}
		});
		timer.start();
	}

	public String toString() {
		return "type:Explode " + super.toString();
	}
}
