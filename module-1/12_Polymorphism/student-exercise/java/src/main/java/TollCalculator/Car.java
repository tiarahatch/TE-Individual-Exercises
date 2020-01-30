package TollCalculator;

public class Car implements Vehicle {
	
	private boolean hasTrailer;
	private String type;
	
	public Car(boolean hasTrailer, String type){
		this.hasTrailer = hasTrailer;
		this.type = type;
	}
	

	public boolean isHasTrailer() {
		return hasTrailer;
	}

	@Override
	public String getType() {
		return this.type;
	}

	
	double toll = 0.0;
	public double calculateToll(int distance) {
		toll = distance * 0.020;
		if(hasTrailer) {
		return toll + 1.00;
		}
		else {
			return toll;
		}
	}
}
