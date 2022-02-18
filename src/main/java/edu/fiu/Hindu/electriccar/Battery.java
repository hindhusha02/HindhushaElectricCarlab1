package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Battery implements SelfCheckCapable {

	private int capacity;
	private String type;
	private String durability;
	private int size;
	private String manufacturer;
	
	private void powerOn() {
		//It Power On's The Car
	}
	
	private void powerOff() {
		//It Power Off's  The Car
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Battery";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

}
