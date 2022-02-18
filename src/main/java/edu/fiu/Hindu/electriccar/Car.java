package edu.fiu.Hindu.electriccar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

public class Car implements GenericComponent{
	
	private String registrationNum;
	private int year;
	private String licensenumber;
	private Acceleration myAcceleration;
	private Battery myBattery;
	private Body myBody;
	private Brake myBrake;
	private Camera myCamera;
	private Door myDoor;
	private Sensor mySensor;
	private GearBox myGearBox;
	private GearBoxType myGearBoxType;
	private Suspension mySuspension;
	private Wheel myWheel;
	private Window myWindow;
	private ElectronicControlUnit myElectronicControlUnit;
	private DataCenter myDataCenter;
	private SelfDriveModule mySelfDriveModule;
	private Software mySoftware;
	private ImageProcessor myImageProcessor;
	private void moveForward(){
		//It Moves The Vehicle Forward
	}
	private void moveBackward(){
		//It Moves The Vehicle Backward
	}
	private void turnLeft() {
		//It Moves The Vehicle Left
	}
	private void turnRight() {
		//It Moves The Vehicle Right 
	}
	private void stop() {
		//It Stops The Vehicle Forward
	}
	private void speed() {
		//It Accelerates The Vehicle 
	}

	
	
	public Car() {
		myAcceleration = new Acceleration();
		myBattery = new Battery();
		myBody= new Body();
	    myBrake = new Brake();
		myCamera = new Camera();
		myDoor = new Door();
		myGearBox = new GearBox();
		mySensor = new Sensor();
		mySuspension = new Suspension();
		myWheel = new Wheel();
		myWindow = new Window();
		myElectronicControlUnit = new ElectronicControlUnit();
		myDataCenter = new DataCenter();
		mySelfDriveModule = new SelfDriveModule();
		mySoftware = new Software();
		myImageProcessor = new ImageProcessor();
		
		
		
	}
	
	public static void main(String[] args){
		//Code Required To Start The Car Is Written Here
		System.out.println("Hello, Welcome to Smart Car");
		


	}

	@Override
	public String getComponentName(){
		// TODO Auto-generated method stub
		return "SmartCar";
	}
		

		@Override
		public boolean selfCheck() {
			// TODO Auto-generated method stub
			return true;
		}
	
		@Override
		public List<SelfCheckCapable> getSubComponents() {
			List internalComponents = new ArrayList(); // create an empty list
			Collections.addAll(internalComponents, myAcceleration,myBattery, myBody, myBrake, myCamera, myDoor, myGearBox, myGearBoxType, mySensor,mySoftware,myImageProcessor, mySuspension, myWheel, myWindow, myElectronicControlUnit,myDataCenter,mySelfDriveModule); // add all your sub components
			return internalComponents;

		}


}

