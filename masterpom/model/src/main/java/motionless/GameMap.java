package motionless;

/**
 * <h1>The Class GameMap provides the code of the model component.</h1>
 * 
 * 
 * @author Valentin Perrier
 * @version 1.0
 */

public class GameMap {
	// ID
	private int id = 0;
	// content of the map
	private String content = "";

	public GameMap(int id, String content) {
		this.id = id;
		this.content = content;
	}

	public GameMap() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return content;
	}

	public void setNom(String content) {
		this.content = content;
	}
}