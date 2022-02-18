package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Door implements SelfCheckCapable{

	private String Doors;
	
	private void open() {
		//It Opens The Door
	}
	
	private void close() {
		//It Closes The Door
	}
	
	private void childLock() {
		//It ChildLocks The Door
	}
	
	private void childUnlock() {
		//It Removes The ChildLock
	}

	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Doors";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	
}
