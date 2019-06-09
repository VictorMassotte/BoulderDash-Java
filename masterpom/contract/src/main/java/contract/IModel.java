package contract;

import java.util.Observable;

import entity.Maps;

/**
 * The IModel is a interface in contract
 * 
 * @author Victor Massotte
 *
 */

public interface IModel {

	Maps getMaps();

	void loadMaps(String code);

	void loadMaps(int map);

	void update();

	Observable getObservable();

}
