package classes;
public class Car {
	
	private double mileage, gasInTank, milesPerGallon, tripMileage, tripGasConsumed;
	
	public Car(double milesPerGallon) {
		super();
		this.milesPerGallon = milesPerGallon;
	}

	// Getters
	public double getMileage() {return mileage;}
	public double getGasInTank() {return gasInTank;}
	public double getMilesPerGallon() {return milesPerGallon;}
	public double getTripMileage() {return tripMileage;}
	public double getTripGasConsumed() {return tripGasConsumed;}

	public void pumpGas(double gallons) {
	    // YOUR CODE HERE
	}

	public void resetTrip() {
	    // YOUR CODE HERE
	}

	public void addMiles(double miles) {
	    // YOUR CODE HERE
	}

	public double getTripMilesPerGallon() {
	    // YOUR CODE HERE
		return 0; // Dummy return
	}
	
	public void refineMPG() {
	    // YOUR CODE HERE
	}
	
	public boolean canReach(double miles) {
	    // YOUR CODE HERE
		return false; // Dummy return
	}
}