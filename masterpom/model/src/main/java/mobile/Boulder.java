package mobile;

import java.awt.Rectangle;
import java.io.IOException;

import Strategy.BoulderStrategy;
import contract.model.IMap;
import contract.model.Permeability;
import contract.model.Sprite;

public class Boulder extends Mobile {

	private static Sprite sprite = new Sprite('O', Sprite.mapTitleSet, new Rectangle(48, 0, 16, 16));

	private static IStrategy strategy = new BoulderStrategy();

	public Boulder(int x, int y, IMap map) throws IOException {
		super(x, y, sprite, map, Permeability.BLOCKING);
		sprite.loadImage();
	}

}
