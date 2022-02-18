package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class ElectronicControlUnit implements SelfCheckCapable {
	
	
	private String manufacturer;
	private String model;
	private float accuracy;

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Electronic Control Unit";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
}
