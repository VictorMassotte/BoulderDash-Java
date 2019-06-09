package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class ViewPanel extends JPanel implements Observer {

	private static final long serialVersionUID = -6841806699190111594L;

	private ViewFrame viewFrame;

	private int nbsprite = 0;
	private final int tailleB = 64;

	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}

	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		Font fonte = new Font("Verdana", Font.BOLD, 30);
		graphics.setFont(fonte);
		graphics.setColor(Color.white);

		if (this.getViewFrame().getController().world != null) {

			int x;
			int y;

			x = this.getViewFrame().getController().world.xhero * this.tailleB / 3;
			y = this.getViewFrame().getController().world.yhero * this.tailleB / 3;

			for (int n = 0; n < this.getViewFrame().getController().world.ymax; n++) {
				for (int i = 0; i < this.getViewFrame().getController().world.xmax; i++) {
					graphics.drawImage(this.getViewFrame().getController().world.sprite[n][i].getImage(),
							i * tailleB - x, n * tailleB - y, i * tailleB + tailleB - x, n * tailleB + tailleB - y,
							this.getViewFrame().getController().world.sprite[n][i].ximg[nbsprite / 10],
							this.getViewFrame().getController().world.sprite[n][i].yimg[nbsprite / 10],
							this.getViewFrame().getController().world.sprite[n][i].ximg[nbsprite / 10] + 16,
							this.getViewFrame().getController().world.sprite[n][i].yimg[nbsprite / 10] + 16, this);
				}

				nbsprite++;

				if (nbsprite == 40) {
					nbsprite = 0;
				}
			}
		} else {
			this.updateUI();
		}
	}
}
