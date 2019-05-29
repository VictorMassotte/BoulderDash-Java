package model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Observable;

import contract.model.Crossable;
import contract.model.IElement;
import contract.model.IMap;
import contract.model.IMobile;

public class Map extends Observable implements IMap {

	private int withd;

	private int height;

	private IElement[][] map;

	private ArrayList<IMobile> pawns;

	private IMobile myCharacter = null;

	private int diamondCount = 0;

	// -------------------------------------------------------------------------

	public Map(int newWidth, int newHeight, IElement[][] newMap) {

		super();
		this.map = newMap;

		this.withd = newWidth;
		this.height = newHeight;
		this.pawns = new ArrayList<IMobile>();

	}

	// -------------------------------------------------------------------------------------

	@Override
	public int getWidth() {
		return this.getWidth();
	}

	@Override
	public int getHeight() {
		return this.getHeight();
	}

	@Override
	public IElement getOnTheMapXY(int x, int y) {
		if (x >= 0 && x < this.getWidth() && y >= 0 && y < this.getHeight()) {
			return this.map[x][y];
		} else {
			return this.map[0][0];
		}
	}

	@Override
	public void setOnTheMapXY(int x, int y, IElement elem) {
		this.map[x][y] = elem;

	}

	@Override
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();

	}

	@Override
	public Observable getObservable() {
		return this;
	}

	@Override
	public void decreaseDiamondCount() {
		this.diamondCount--;

	}

	@Override
	public int getDiamondCount() {
		// TODO Auto-generated method stub
		return this.diamondCount;
	}

	@Override
	public void addDiamondCount() {
		this.diamondCount++;

	}

	@Override
	public IMobile getMyCharacter() {
		return this.myCharacter;
	}

	@Override
	public void setMyCharacter(IMobile newChara) {
		this.myCharacter = newChara;

	}

	@Override
	public Crossable getSquarelsOccupied(int x, int y) {
		Point point = new Point(x, y);
		for (IMobile pawn : this.getPawns()) {
			if (pawn.getPosition().equals(point)) {

				return pawn.getCrossable();
			}
		}

		if (this.getMyCharacter().getPosition().equals(point)) {

			return this.getMyCharacter().getCrossable();
		}

		return this.getOnTheMapXY(x, y).getCrossable();
	}

	@Override
	public void addPawn(IMobile pawn) {
		this.pawns.add(pawn);

	}

	@Override
	public ArrayList<IMobile> getPawns() {
		return this.pawns;
	}

	@Override
	public String toString() {
		String temp = new String();
		for (int y = 0; y < this.getHeight(); y++) {
			for (int x = 0; x < this.getWidth(); x++) {
				temp += map[x][y].getSprite().getConsoleImage();
			}
			temp += '\n';
		}
		return temp;
	}
}
