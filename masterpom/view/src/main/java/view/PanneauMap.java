package view;

import java.awt.CardLayout;

import javax.swing.JPanel;

/**
 * <h1>The Class PaneauMap provides the code of the model view.</h1>
 * 
 * 
 * @author Kevin Meffodong
 * @version 1.0
 */
public class PanneauMap extends JPanel {

	private Map1 level1;
	private Map2 level2;
	private Map3 level3;
	private Map4 level4;
	private Map5 level5;

	private CardLayout cl;

	public PanneauMap() {
		super();

		level1 = new Map1();
		level2 = new Map2();
		level3 = new Map3();
		level4 = new Map4();
		level5 = new Map5();
		cl = new CardLayout();
		this.setLayout(cl);
		this.add("level1", level1);
		this.add("level2", level2);
		this.add("level3", level3);
		this.add("level4", level4);
		this.add("level5", level5);

	}

	public void SetCard(String name) {
		cl.show(this, name);
	}

	public Map1 getLevel1() {
		return level1;
	}

	public Map2 getLevel2() {
		return level2;
	}

	public Map3 getLevel3() {
		return level3;
	}

	public Map4 getLevel4() {
		return level4;
	}

	public Map5 getLevel5() {
		return level5;
	}

	public CardLayout getCl() {
		return cl;
	}

}
