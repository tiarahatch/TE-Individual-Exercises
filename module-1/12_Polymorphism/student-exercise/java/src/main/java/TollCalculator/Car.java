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

	public double calculateToll(int distance) {
		double toll = 0.0;

		if(hasTrailer) {
			toll = distance * 0.020;
		}
		else {
			toll = (distance * 0.020) + 1.00;
		}
		return toll;
	}
}
