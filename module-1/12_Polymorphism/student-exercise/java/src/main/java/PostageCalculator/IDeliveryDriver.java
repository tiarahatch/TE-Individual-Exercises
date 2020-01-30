package PostageCalculator;

public interface IDeliveryDriver {

	public String getname();
	double calculateRate(int distance, double weight);
}
