package contract.controller;

import java.io.IOException;

/**
 * <h1>The IOrderPerformer UserOrder.</h1>
 *
 * @author Valentin
 * @version 0.1
 */

public interface IOrderPerformer {

	void orderPerform(UserOrder userOrder) throws IOException;

}

//