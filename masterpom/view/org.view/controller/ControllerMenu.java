package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Fenetre;
import view.PanneauApp;
import view.PanneauMenu;

public class ControllerMenu implements ActionListener {
     private Fenetre fenetre;
      
     public ControllerMenu(Fenetre fenetre) {
		super();
		this.fenetre = fenetre;
		
		fenetre.getPanneauAp().getMenuPanel().getLevel1().addActionListener(this);
		fenetre.getPanneauAp().getMenuPanel().getLevel2().addActionListener(this);
		fenetre.getPanneauAp().getMenuPanel().getLevel3().addActionListener(this);
		fenetre.getPanneauAp().getMenuPanel().getLevel4().addActionListener(this);
		fenetre.getPanneauAp().getMenuPanel().getLevel5().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 Object source = e.getSource();
		 
		 if(source == fenetre.getPanneauAp().getMenuPanel().getLevel1()) {
			fenetre.getPanneauAp().getMapPanel().getCl().show(fenetre.getPanneauAp().getMapPanel(), "level1");
			System.out.println("Map1 Loaded");
			
		 }
		 if(source == fenetre.getPanneauAp().getMenuPanel().getLevel2()) {
				fenetre.getPanneauAp().getMapPanel().getCl().show(fenetre.getPanneauAp().getMapPanel(), "level2");
				System.out.println("Map2 Loaded");
			 }
		 if(source == fenetre.getPanneauAp().getMenuPanel().getLevel3()) {
				fenetre.getPanneauAp().getMapPanel().getCl().show(fenetre.getPanneauAp().getMapPanel(), "level3");
				System.out.println("Map3 Loaded");
			 }		 
		 if(source == fenetre.getPanneauAp().getMenuPanel().getLevel4()) {
				fenetre.getPanneauAp().getMapPanel().getCl().show(fenetre.getPanneauAp().getMapPanel(), "level4");
				System.out.println("Map4 Loaded");
			 }
		 if(source == fenetre.getPanneauAp().getMenuPanel().getLevel5()) {
				fenetre.getPanneauAp().getMapPanel().getCl().show(fenetre.getPanneauAp().getMapPanel(), "level5");
				System.out.println("Map5 Loaded");
			 }
	}
     
     
}
