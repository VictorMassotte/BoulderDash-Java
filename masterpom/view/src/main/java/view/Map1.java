package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mobile.Hero;

/**
 * <h1>The Class Map1 provides the code of the model view.</h1>
 * 
 * 
 * @author Kevin Meffodong
 * @version 1.0
 */
public class Map1 extends JPanel {
	private JLabel Map1;
	private Hero he;

	public Map1() {
		ImageIcon icone = new ImageIcon("file:///C:/Users/Kevdu/git/boulderdash1/masterpom/main/hero.png");
		Map1 = new JLabel(icone);
		this.add(Map1);

	}

}