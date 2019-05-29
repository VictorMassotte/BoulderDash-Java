package model;

import java.util.ArrayList;
import java.util.Observable;

import contract.model.IElement;
import contract.model.IMap;
import contract.model.IMobile;
import contract.model.IModel;
import contract.model.Crossable;

public class Map extends Observable implements IMap {

	private int withd;

	private int height;

	private IElement[][] map;

	private ArrayList<IMobile> pawns;

	private IMobile myCharacter = null;

	private int diamondCount = 0;

	public Map(int newWidth, int newHeight, IElement[][] newMap) {

		super();
		this.map = newMap;

		this.withd = newWidth;
		this.height = newHeight;
		this.pawns = new ArrayList<IMobile>();

	}

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOnTheMapXY(int x, int y, IElement elem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMobileHasChanged() {
		// TODO Auto-generated method stub

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
	public IModel getMyCharacter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMyCharacter() {
		IMobile newcharacter = null;
		this.myCharacter = newcharacter;

	}

	@Override
	public Crossable getSquarelsOccupied(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPawn(IMobile pawn) {
		this.pawns.add(pawn);

	}

	@Override
	public ArrayList<IMobile> getPawns() {
		// TODO Auto-generated method stub
		return this.pawns;
	}

}
