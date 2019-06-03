package contract.controller;

/**
 * <h1>The Class IController provides the code of the model component.</h1>
 * 
 * 
 * @author Victor Massotte
 * @version 1.0
 */

public interface IController {

	void play() throws InterruptedException;

	IOrderPerformer getOrderPeformer();
}
