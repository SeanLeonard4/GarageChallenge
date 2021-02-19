package com.qa.challenges.garage;

public class Tank extends Vehicle {
	public Tank(String make, String model, String engine, int wheels) {
		super(make, model, engine, wheels);
	}

	@Override
	public String doesAction() {
		return "Tanks blow's up houses";
	}
}
