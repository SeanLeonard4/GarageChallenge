package com.qa.challenges.garage;

public class Motorbike extends Vehicle {

	public Motorbike(String make, String model, String engine, int wheels) {
		super(make, model, engine, wheels);
	}

	@Override
	public String doesAction() {
		return "I dont know, Motorbikes generally just overcompensate...";
	}
}
