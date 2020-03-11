package TollCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TollCalculator {

	public static void main(String[] args) {
		
		
		double toll = 0.00;
		boolean hasTrailer = true;
		Tank tank = new Tank();
		Car car2 = new Car(!hasTrailer);
		Car car1  = new Car(hasTrailer);
		Truck truck1 = new Truck(4);
		Truck truck2 = new Truck(6);
		Truck truck3 = new Truck(8);
		
		
		List<String> vehicleType = new ArrayList<String>();
		
	    
		vehicleType.add(truck1 );
	    Vehicle truck2 = new Vehicle();
		myTollList.add(truck2 );
	    myTollList.add(truck3);
	    myTollList.add(car1);
	    myTollList.add(car2);
	    myTollList.add(tank);
	    
	    System.out.println(String.format("%-15s | %-10s | %-10s", "Vehicle", "Distance", "Toll $"));
	    System.out.println("------------------------------------------");
	    
	    
	    double totalDistance = 0;
	    double totalTollRevenue = 0;
	    
	    
	    for (Vehicle c : myTollList) {
	        Random rand = new Random();
	        
	        
	        int rand_int1 = rand.nextInt(200);
	        
	        System.out.println(c.getType() + " | " + rand_int1 + " | " + c.calculateToll(rand_int1));
	        totalDistance += rand_int1;
	        totalTollRevenue += c.calculateToll(rand_int1);
	    }
	    System.out.println("**********************");
	    System.out.println("Total Hours: " + totalDistance);
	    System.out.println("Total Pay: " + totalTollRevenue);

	}

}
