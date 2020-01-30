package TollCalculator;

public class Truck implements Vehicle {
	
	private int numberOfAxels;
	private double ratePerMile = 0.0;
	private String type;
	public String name = "Truck";
	
	public Truck(int numberOfAxels, String type) {
		this.numberOfAxels = numberOfAxels;
		this.type = type;
	}

	public int getNumberOfAxels() {
		return numberOfAxels;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public double calculateToll(int distance) {
		double toll = ratePerMile * distance;
		if(getNumberOfAxels() <= 4) {
			ratePerMile = 0.040;
			return toll;
		}
		else if (getNumberOfAxels() <= 6) {
			ratePerMile = 0.045;
			return toll;
		}
		else {
			ratePerMile = 0.048;
			return toll;
		}
	}			
}
