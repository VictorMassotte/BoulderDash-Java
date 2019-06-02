package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mobile.Hero;

public class Map1 extends JPanel{
	private JLabel Map1; 
    private Hero he;



	public Map1() {
		ImageIcon icone = new ImageIcon("file:///C:/Users/Kevdu/git/boulderdash1/masterpom/main/hero.png");		
		Map1 = new JLabel(icone);				
		this.add(Map1);
		
	}
	

}