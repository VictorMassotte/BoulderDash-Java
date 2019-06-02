package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mobile.Hero;
import mobile.Sprite;
import view.Fenetre;

public class ControllerMenu implements ActionListener {
     

	private Fenetre fenetre;
	private Hero he;
    private Sprite sprite;
    
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
			
			
			
			
		 }
		 if(source == fenetre.getPanneauAp().getMenuPanel().getLevel2()) {
				fenetre.getPanneauAp().getMapPanel().getCl().show(fenetre.getPanneauAp().getMapPanel(), "level2");
				
			 }
		 if(source == fenetre.getPanneauAp().getMenuPanel().getLevel3()) {
				fenetre.getPanneauAp().getMapPanel().getCl().show(fenetre.getPanneauAp().getMapPanel(), "level3");
				
			 }		 
		 if(source == fenetre.getPanneauAp().getMenuPanel().getLevel4()) {
				fenetre.getPanneauAp().getMapPanel().getCl().show(fenetre.getPanneauAp().getMapPanel(), "level4");
				
			 }
		 if(source == fenetre.getPanneauAp().getMenuPanel().getLevel5()) {
				fenetre.getPanneauAp().getMapPanel().getCl().show(fenetre.getPanneauAp().getMapPanel(), "level5");
			
			 }
	
}
	

}	