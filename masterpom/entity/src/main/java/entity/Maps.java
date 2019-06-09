package entity;

/**
 * The Maps is a class in entity
 * 
 * @author Victor Massotte
 *
 */

public class Maps extends Entity {

	private int id;

	private String nom;
	private int diamond;
	private int time;
	private String map;

	public Maps(final int id, final int diamond, final int time, final String map) {
		this.setId(id);
		this.setDiamond(diamond);
		this.setTime(time);
		this.setMap(map);

	}

	// -----------------------------------------------------------------

	public Maps() {
		this(0, 0, 0, "");

	}

	// -----------------------------------------------------------------

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	// -----------------------------------------------------------------

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	// -----------------------------------------------------------------

	public int getDiamond() {
		return diamond;
	}

	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}

	// -----------------------------------------------------------------

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	// -----------------------------------------------------------------

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	// -----------------------------------------------------------------

}
