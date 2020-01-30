package PostageCalculator;

public class SPUTwoDayBusiness implements IDeliveryDriver {

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double shipRate = 0;
		shipRate = (weight * 0.050) * distance;
		return shipRate;
	}

}
