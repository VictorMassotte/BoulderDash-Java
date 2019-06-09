package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IModel;
import controller.Controller;

public class ViewFrame extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1792798008247782711L;

	private IModel model;

	private Controller controller;

	// ------------------------------------------------------------------------------

	// We are calling the superclass which contains the title to instantiate him in
	// the view frame
	public ViewFrame(final IModel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);

	}

	// The Graphic destination is instantiated in the view frame
	public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
	}

	// This method regroup the title and the graphic configuration destination is
	// the view frame
	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
	}

	// We instantiate a new view frame with the model's data
	public ViewFrame(final IModel model) throws HeadlessException {
		this.buildViewFrame(model);
	}
	// ------------------------------------------------------------------------------

	public Controller getController() {
		return this.controller;
	}

	protected void setController(final Controller controller) {
		this.controller = controller;
	}

	// ------------------------------------------------------------------------------

	protected IModel getModel() {
		return this.model;
	}

	private void setModel(final IModel model) {
		this.model = model;
	}

	// ------------------------------------------------------------------------------

	// This is our window which will contains the maps
	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Boulder Dash Game");
		this.addKeyListener(this);
		this.setContentPane(new ViewPanel(this));
		this.setSize(1920 + this.getInsets().left + this.getInsets().right,
				1080 + this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
	}

	// ------------------------------------------------------------------------------

	// This method will show us a "pop-up" that will ask us to choice the map in
	// which we will play
	public void printMessage(final String messageLevel, final String messageMap) {
		int map = 10;

		while (map < 0 || map > 5) {
			try {
				map = Integer.parseInt(JOptionPane.showInputDialog(messageMap));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		int level = 10;
		while (level < 0 || level > 6)
			try {
				level = Integer.parseInt(JOptionPane.showInputDialog(messageLevel));
			} catch (Exception e) {
				e.printStackTrace();
			}

		this.getController().buildMap(map, level);
	}

	// ------------------------------------------------------------------------------

	public void keyTyped(final KeyEvent e) {

	}

	// ------------------------------------------------------------------------------

	// The keyboard pressed touches are collected in this method from the controller
	public void keyPressed(final KeyEvent e) {
		this.getController().orderPerform(View.keyControllerOrder(e.getKeyCode()));
	}

	// ------------------------------------------------------------------------------

	public void keyReleased(final KeyEvent e) {

	}

	// ------------------------------------------------------------------------------

}
