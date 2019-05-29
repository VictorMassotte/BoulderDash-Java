package contract.model;

import java.util.ArrayList;
import java.util.Observable;

public interface IMap {

	public int getWidth();

	public int getHeight();

	public IElement getOnTheMapXY(int x, int y);

	public void setOnTheMapXY(int x, int y, IElement elem);

	public void setMobileHasChanged();

	public Observable getObservable();

	public void decreaseDiamondCount();

	public int getDiamondCount();

	public void addDiamondCount();

	public IMobile getMyCharacter();

	public void setMyCharacter(IMobile character);

	public Crossable getSquarelsOccupied(int x, int y);

	public void addPawn(IMobile pawn);

	public ArrayList<IMobile> getPawns();

}
