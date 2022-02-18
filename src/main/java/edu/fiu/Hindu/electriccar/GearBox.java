package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class GearBox implements SelfCheckCapable {
	
	public float gearRatio;
	public int currentGear;
	
	private void shiftUp() {
		//It Shifts The Gear Up 
	}
	
	private void shiftDown() {
		
		//It Shifts The Gear Down 
	}
	
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "GearBox";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
}
