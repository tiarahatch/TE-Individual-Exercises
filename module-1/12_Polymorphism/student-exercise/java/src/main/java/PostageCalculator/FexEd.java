package PostageCalculator;

public class FexEd implements IDeliveryDriver {
	
	public String name = "FexEd";

	public FexEd() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double flatRate = 20.00;
		if (distance > 500) {
			 flatRate += 5.00;
		}
		else if (weight > 48) {
			 flatRate += 3.00;
		}
		return flatRate;
	}

}
