package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Window implements SelfCheckCapable{

private String Windows;

private void slideUp() {
	//It Slides The Window Up
}

private void slideDown() {
	//It Slides The Window Down
}

@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "Windows";
}

@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.5);
}

}
