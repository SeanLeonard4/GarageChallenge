package com.qa.challenges.garage;

public class Main {

	public static void main(String[] args) {

		var c1 = new Car("Toyota", "Aygo", "1", 4, "blue");
		var c2 = new Car("car", "car", "1", 4, "red");
		var m1 = new Motorbike("Dirt", "bike", "1", 2);
		var t1 = new Tank("T-28", "Super heavy tank", "??", 100);

		var storage = new Garage();

		storage.emptyGarage();

		storage.addVehicle(c1);
		storage.addVehicle(c2);
		storage.addVehicle(m1);
		storage.addVehicle(t1);

		System.out.println("===Full garage===");
		storage.printGarage();

		System.out.println("Vehicle repair");
		System.out.println(storage.repairVehicle(m1));

		System.out.println("Car one ID: " + m1.getID());
		System.out.println("Car two ID: " + c2.getID());
		System.out.println("Motorbike one ID: " + m1.getID());
		System.out.println("Tank one ID: " + t1.getID());

		System.out.println("=====ACTIONS=====");
		System.out.println(m1.doesAction());
		System.out.println(c1.doesAction());

		/*
		 * System.out.println("Deleted C2 based off ID");
		 * 
		 * storage.printGarage();
		 */

		System.out.println("Emptied garage print below");
		storage.emptyGarage();
		storage.printGarage();

		System.out.println("===========================");

	}

}
