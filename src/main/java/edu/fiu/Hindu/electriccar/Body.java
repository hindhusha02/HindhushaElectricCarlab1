package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Body implements SelfCheckCapable {
	
	private String color;
	private String model;
	private String manufacturer;
	private int price;
	private int dimension;
	private String shape;
	private String material;
	private int weight;
	private int numberOfDoor;
	private int numberOfSeats;

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Body";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

	
}
