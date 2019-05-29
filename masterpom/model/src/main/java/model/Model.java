package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import contract.model.IMap;
import contract.model.IMobile;
import contract.model.IModel;
import contract.model.Sprite;
import mobile.MyCharacter;
import model.DAO.MapDAO;

public class Model implements IModel {

	private IMap map;

	private MyCharacter myCharacter;

	public Model(int mapID) throws SQLException, IOException {
		super();
		Sprite.loadBuffers();
		this.setMap(MapDAO.getMapById(mapID));
		this.setMyCharacter(new MyCharacter(1, 1, this.getMap()));

	}

	private void setMap(Map newMap) {
		this.map = newMap;

	}

	@Override
	public IMap getMap() {
		return this.map;
	}

	@Override
	public MyCharacter getMyCharacter() {
		return this.myCharacter;
	}

	private void setMyCharacter(MyCharacter newChara) {
		this.myCharacter = newChara;
	}

	@Override
	public void movePawns() {
		ArrayList<IMobile> copyPawns = new ArrayList<>(this.getMap().getPawns());

		for (IMobile pawn : copyPawns) {
			pawn.followMyStrategy();
		}

		if (this.getMyCharacter().isCrushed())
			this.getMyCharacter().die();

	}

}
