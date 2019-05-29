package motionless;

import contract.model.Crossable;
import contract.model.Sprite;
import factory.Element;

public abstract class MotionLessElement extends Element 
{
	
	public MotionLessElement(Sprite sprite, Crossable crossable)
	{
		super(sprite, crossable);
	}
}
