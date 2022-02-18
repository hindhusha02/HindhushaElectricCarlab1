package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Suspension implements SelfCheckCapable {

private float sprinRate;

private void apply() {
	//It Applies Suspension
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
