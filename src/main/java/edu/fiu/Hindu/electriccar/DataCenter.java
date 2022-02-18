package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class DataCenter implements SelfCheckCapable{

		private String type;
		
		
		private void read() {};
		private void write() {};
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Data Center";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
}
