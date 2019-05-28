package contract.model;

import java.util.Observable;

public interface IMap {

	public int getWidth();

	public int getHeight();

	public IElement getOnTheMapXY(int x, int y);

	public void setOnTheMapXY(int x, int y, IElement element);

	public void setMobileHasChanged();

	public Observable getObservable();

	public void decreaseDiamondCount();

	public int getDiamondCount();

	public void addDiamondCount();

	public IModel getMyCharacter();

	public void setMyCharacter();

	public Permeability getSquarelsOccupied(int x, int y);

	public void addPawn(IMobile pawn);

	public IMobile getPawns();

}