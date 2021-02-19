package com.qa.challenges.garage;

public class Car extends Vehicle {
	private String colour;

	public Car(String make, String model, String engine, int wheels, String colour) {
		super(make, model, engine, wheels);
		setColour(colour);
	}

	@Override
	public String doesAction() {
		return "Its a car. I have no clue, they drive on four wheels and most people use them";
	}

	@Override
	public String toString() {
		return "This vehicle is a " + colour + " " + getMake() + " " + getModel() + ". It contains a " + getEngine()
				+ "Litre engine" + ". It also has " + getWheels() + " wheels!";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
