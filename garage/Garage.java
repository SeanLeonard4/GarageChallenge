package com.qa.challenges.garage;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicleList = new ArrayList<>();
	int ID = 0;

	public void addVehicle(Vehicle vehicle) {

		/*
		 * Why doesn't this work to increment ID - sets values not as 1,2,3,4 but
		 * randomly???
		 */

		vehicleList.add(vehicle);
		for (Vehicle i : vehicleList) {
			i.IDIncrement(ID);
			ID++;
		}
	}

	public void removeVehicle(Vehicle vehicle) {

		vehicleList.remove(vehicle);

	}

	public void removeXVehicle(Vehicle input) {

		for (Vehicle i : vehicleList) {
			if (i instanceof Car && input instanceof Car) {
				vehicleList.remove(i);
			} else if (i instanceof Tank && input instanceof Tank) {
				vehicleList.remove(i);
			} else if (i instanceof Motorbike && input instanceof Motorbike)
				vehicleList.remove(i);
		}
	}

	public void removeVehicleID(int ID) {

		for (Vehicle i : vehicleList) {
			if (ID == i.getID()) {
				vehicleList.remove(i);

			}
		}
	}

	public String repairVehicle(Vehicle input) {

		if (input instanceof Car) {
			return "That car repair will cost £50";
		} else if (input instanceof Tank) {
			return "That tank will cost you £2000 my friend";
		} else if (input instanceof Motorbike)
			return "that motorbike is expensive, £5000";
		return null;
	}

	public void emptyGarage() {

		vehicleList.clear();

	}

	public int garageSize() {

		return vehicleList.size();

	}

	public void printGarage() {

		for (Vehicle i : vehicleList) {
			System.out.println(i.toString());

		}
	}

}
