package factory;

import javax.lang.model.element.Element;

import motionless.Dugdirt;
import motionless.Filleddirt;
import motionless.Wall;

public class ElementFactory {

	private static Wall wall = new Wall();

	private static Dugdirt dugdirt = new Dugdirt();

	private static Filleddirt filleddirt = new Filleddirt();

	private static Element[] element= {
			wall
			dugdirt,
			filleddirt
			
	};

	public static Element createDugdirt() {
		return dugdirt;
	}

	public static Element createWall() {
		return wall;
	}

	public static Element crateFilleddirt() {
		return filleddiret;
	}

	public static Element getFromFileSymbol(char fileSymbol) {
		for(Element motionlessElement: elements ) {
			if(motionlessElement.getSprite(.getConsoleImage() == fileSymbol)) {
				return motionlessElement;
			}
		}
	}

}
