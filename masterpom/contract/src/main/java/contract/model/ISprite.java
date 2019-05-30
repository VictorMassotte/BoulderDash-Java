package contract.model;

public interface ISprite {

	public int posX = 0;
	public int posY = 0;
	public String path = "empty.png";
	public Boolean isSolid = false;
	public Boolean isMoveable = false;
	public Boolean isActive = true;
	public int speed = 0;
	public int time = 0;

	public void setPosX(int i);

}
