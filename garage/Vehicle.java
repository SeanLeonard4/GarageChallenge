package com.qa.challenges.garage;

public class Vehicle {

	private String make;
	private String model;
	private String engine;
	private int ID;
	private int noOfWheels;

	public Vehicle(String make, String model, String engine, int wheels) {
		this.make = make;
		this.model = model;
		this.engine = engine;
		this.noOfWheels = wheels;
	}

	@Override
	public String toString() {
		return "This vehicle is a " + make + " " + model + ". It contains a " + engine + "Litre engine"
				+ ". It also has " + noOfWheels + " wheels!";
	}

	public void IDIncrement(int id) {
		ID = id;
	}

	public String doesAction() {
		return "beep";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return noOfWheels;
	}

	public void setWheels(int wheels) {
		this.noOfWheels = wheels;
	}

	public int getID() {
		return ID;
	}

}
