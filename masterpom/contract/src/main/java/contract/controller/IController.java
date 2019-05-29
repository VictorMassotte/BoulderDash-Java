package contract.controller;

/**
 * The Interface IController.
 *
 * @author Jean-Aymeric Diet
 */
public interface IController {

	/**
	 * play.
	 * @throws InterruptedException 
	 */
	public void play() throws InterruptedException;

	public void orderPerform(UserOrder StackOrder);
}
