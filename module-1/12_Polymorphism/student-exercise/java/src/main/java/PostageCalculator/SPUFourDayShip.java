package PostageCalculator;

public class SPUFourDayShip implements IDeliveryDriver {
	
	public String name = "SPUFourDayShip";
	
	
	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double shipRate = 0;
		shipRate = (weight * 0.0050) * distance;
		return shipRate;
	}

}
