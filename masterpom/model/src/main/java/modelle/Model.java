package modelle;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.Maps;

/**
 * The Model is a class in model
 * 
 * @author Victor Massotte
 *
 */
public final class Model extends Observable implements IModel {

	private Maps map;

	// ------------------------------------------------------------------------------

	public Model() {
		this.map = new Maps();
	}

	// ------------------------------------------------------------------------------

	public Maps getMaps() {
		return this.map;
	}

	private void setMaps(final Maps map) {
		this.map = map;
		this.setChanged();
		this.notifyObservers();
	}

	// ------------------------------------------------------------------------------

	public void loadMaps(final String code) {
		try {
			final DAOMaps daoMaps = new DAOMaps(DBConnection.getInstance().getConnection());
			this.setMaps(daoMaps.find(code));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	// ------------------------------------------------------------------------------

	public void update() {
		this.setChanged();
		this.notifyObservers();
	}

	// ------------------------------------------------------------------------------

	public Observable getObservable() {
		return this;
	}

	// ------------------------------------------------------------------------------

	@Override
	public void loadMaps(final int map) {
		try {
			final DAOMaps daoMaps = new DAOMaps(DBConnection.getInstance().getConnection());
			this.setMaps(daoMaps.find(map));
		} catch (final SQLException e) {
			e.printStackTrace();
		}

	}

	// ------------------------------------------------------------------------------

}
