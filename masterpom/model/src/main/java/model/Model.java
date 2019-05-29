package model;

import java.io.IOException;
import java.sql.SQLException;

import contract.model.IMap;
import contract.model.IMobile;
import contract.model.IModel;
import contract.model.Sprite;
import model.DAO.MapDAO;

public class Model implements IModel {

	private IMap map;

	private mobile.MyCharacter mycharacter;

	public Model(int mapID) throws SQLException, IOException {
		super();
		Sprite.loadBuffers();

		this.setMap(MapDAO.getMapById(mapID));

	}

	private void setMap(Object mapByID) {
		// TODO Auto-generated method stub

	}

	@Override
	public IMap getMap() {
		// TODO Auto-generated method stub
		return map;
	}

	@Override
	public IMobile getMyCharacter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void movePawns() {
		// TODO Auto-generated method stub

	}

}
