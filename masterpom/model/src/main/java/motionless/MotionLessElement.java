package motionless;

import contract.model.Permeability;
import contract.model.Sprite;
import factory.Element;

public abstract class MotionLessElement extends Element 
{
	
	public MotionLessElement(Sprite sprite, Permeability permeability)
	{
		super(sprite, permeability);
	}
}
