package TollCalculator;

public class Tank implements Vehicle {

	private String type;

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public double calculateToll(int distance) {
		double ratePerMile = 0;
		return ratePerMile * distance;
	}

}
