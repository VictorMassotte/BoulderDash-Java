package factory;

import mobile.Sprite;

public class Empty extends Sprite {


	private static final long serialVersionUID = -8459095578519323906L;

	public Empty()
	{
		super();
		this.setImage();
	}
	
	public Empty(int pPosX, int pPosY)
	{
		super(pPosX, pPosY);
		this.setImage();
	}

	
	public String toString()
	{
		return "type:Dirt " + super.toString();
	}
	
}
