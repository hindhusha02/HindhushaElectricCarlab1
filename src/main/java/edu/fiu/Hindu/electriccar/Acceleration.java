package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Acceleration implements SelfCheckCapable {

private String type;
private Acceleration myAccleration;

private void apply() {
	//It Applies Acceleration
	
}

@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "Acceleration";
}

@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.5);
}


}
