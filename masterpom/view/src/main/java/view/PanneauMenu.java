package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * <h1>The Class PanneauMenu provides the code of the model view.</h1>
 * 
 * 
 * @author Kevin Meffodong
 * @version 1.0
 */
public class PanneauMenu extends JPanel {

	private JButton level1 = new JButton("Level1");
	private JButton level2 = new JButton("Level2");
	private JButton level3 = new JButton("Level3");
	private JButton level4 = new JButton("Level4");
	private JButton level5 = new JButton("Level5");

	public PanneauMenu() {
		super();
		this.setLayout(new GridLayout(5, 1));
		this.add(level5);
		this.add(level4);
		this.add(level3);
		this.add(level2);
		this.add(level1);

		this.setPreferredSize(new Dimension(140, 140));
		this.setBackground(Color.black);

	}

	public JButton getLevel1() {
		return level1;
	}

	public JButton getLevel2() {
		return level2;
	}

	public JButton getLevel3() {
		return level3;
	}

	public JButton getLevel4() {
		return level4;
	}

	public JButton getLevel5() {
		return level5;
	}

}
