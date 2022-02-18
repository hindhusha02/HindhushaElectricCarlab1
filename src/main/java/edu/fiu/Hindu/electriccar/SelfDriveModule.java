package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class SelfDriveModule implements SelfCheckCapable{
	
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Self Drive Module";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

}
