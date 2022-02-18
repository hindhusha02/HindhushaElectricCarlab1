package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Brake implements SelfCheckCapable{

	private String Type;

	private void apply() {
		//It Applies Brakes
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Brakes";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	
}
