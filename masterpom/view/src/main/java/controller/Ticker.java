package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Ticker is a class in view
 * 
 * @author
 *
 */
public class Ticker implements ActionListener {

	private Controller controller;

	private int n;

	private boolean fin;

	public Ticker(Controller controller) {
		this.fin = false;
		this.controller = controller;
		n = 0;

	}

	public void actionPerformed(ActionEvent event) {

		if (n % 20 == 0) {
			this.controller.world.update();
		}

		this.controller.model.update();

		if (n % 50 == 0)
			this.controller.time();

		if (n % 100 == 0)

		{
			if (this.controller.world.exit) {
				if (fin) {
					System.exit(1);

				}

				fin = true;
			}
			System.out.println(fin);
		}

		n++;

		if (n == 10000) {
			n = 0;
		}

	}
}