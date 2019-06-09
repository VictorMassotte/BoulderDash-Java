package controller;

import javax.swing.Timer;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import modelle.World;

/**
 * The Controller is a class in view
 * 
 * @author
 *
 */
public class Controller implements IController {

	private IView view;

	public IModel model;

	public World world;

	public int seconde;

	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.model = model;
	}

	public void buildMap(final int map, final int level) {

		this.model.loadMaps(map);

		this.world = new World(this.model.getMaps().getMap(), this.model.getMaps().getDiamond(), level);

		Timer t = new Timer(25, new Ticker(this));
		t.start();

	}

	public void control() {
		this.view.printMessage("Which decors do you want on the map [1 - 6]", "Choose the level of the map [1 - 5}");
	}

	private void setView(final IView pview) {
		this.view = pview;
	}

	public void time() {
		this.seconde--;
		if (this.seconde == 0) {
			System.exit(0);
		}
	}

	public void orderPerform(final ControllerOrder controllerOrder) {
		if (!this.world.exit) {
			switch (controllerOrder) {
			case UP:
				this.world.moveHero("UP");
				break;

			case RIGHT:
				this.world.moveHero("RIGHT");
				break;

			case DOWN:
				this.world.moveHero("DOWN");
				break;

			case LEFT:
				this.world.moveHero("LEFT");
				break;
			}
		}
	}

}
