package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Sensor implements SelfCheckCapable {

	private String type;
	private int cost;
	private String version;
	private String manufacturer;
	
	private void activatePneumaticSystem() {
		// It Activates Pneumatic System
	}
	
	private void IdentifyObstacle() {
		// It identifies obstacles
	}
	
	private void warnings() {
		// It gives out warning messages 
	}
	
	private void SpeedAdjust() {
		//It automatically adjusts speed 
	}
	
	private void SemiAutonomous() {
		//It lets the car to Function In Both Manual and in Autonomous Mode 
	}
	
	private void SignDetection() {
		//It Detects Traffic and Road Signs 
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
