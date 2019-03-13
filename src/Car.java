public class Car {
	
	private double mileage;
	private double gasInTank;
	private double milesPerGallon;
	private double tripMileage;
	private double tripGasConsumed;
	
	public Car(double milesPerGallon) {
		super();
		this.milesPerGallon = milesPerGallon;
	}

	public double getMileage() {
		return mileage;
	}

	public double getGasInTank() {
		return gasInTank;
	}

	public double getMilesPerGallon() {
		return milesPerGallon;
	}

	public double getTripMileage() {
		return tripMileage;
	}

	public double getTripGasConsumed() {
		return tripGasConsumed;
	}

	public void pumpGas(double gallons) {
	    this.gasInTank = this.gasInTank + gallons;
	}

	public void resetTrip() {
	    this.tripMileage = 0;
	    this.tripGasConsumed = 0;
	}

	public void addMiles(double miles) {
        this.mileage = this.mileage + miles;
        this.tripMileage = this.tripMileage + miles;
        this.tripGasConsumed = this.tripMileage / this.milesPerGallon;
        this.gasInTank = this.gasInTank - (miles/this.milesPerGallon);
	}

	public double getTripMilesPerGallon() {
	    return this.tripMileage / this.tripGasConsumed;
	}
	
	public void refineMPG() {
		this.milesPerGallon = (this.milesPerGallon + (this.getTripMilesPerGallon() * 2))/3;
	}
	
	public boolean canReach(double miles) {
		return(this.gasInTank * this.milesPerGallon >= miles);
	}
}