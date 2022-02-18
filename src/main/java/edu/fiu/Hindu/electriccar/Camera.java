package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Camera implements SelfCheckCapable {

private String frontCam;
private String backCam;

private void showVideo() {
	//It Shows Front Cam Video Feed
}

private void capturePicture() {
	//It Captures Pictures
}

private void captureVideo() {
	//It Captures Videos
}

@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "Sensors";
}

@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.5);
}

}
