package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Wheel implements SelfCheckCapable {

 private int diameter;
 private int numberOfWheels;
 private int airPressure;
 
 private void rotate() {
	 //It rotates wheels
	 
 }

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Whee";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
 
}
