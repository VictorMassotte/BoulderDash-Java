package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PanneauApp extends JPanel {
     private PanneauMenu menuPanel;
     private PanneauMap  mapPanel;
	
     
     
     public PanneauApp() {
		super();
	     menuPanel = new PanneauMenu();
		 mapPanel = new PanneauMap();
		 
		 this.setLayout(new BorderLayout());
		 this.add(menuPanel, BorderLayout.WEST);
		 this.add(mapPanel, BorderLayout.CENTER);
		 
	}



	public PanneauMenu getMenuPanel() {
		return menuPanel;
	}



	public void setMenuPanel(PanneauMenu menuPanel) {
		this.menuPanel = menuPanel;
	}



	public PanneauMap getMapPanel() {
		return mapPanel;
	}



	public void setMapPanel(PanneauMap mapPanel) {
		this.mapPanel = mapPanel;
	}
     
     
}
