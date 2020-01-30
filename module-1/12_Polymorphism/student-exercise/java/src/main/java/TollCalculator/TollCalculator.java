package TollCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TollCalculator {

	public static void main(String[] args) {
		
		List<Vehicle> myTollList = new ArrayList<Vehicle>();
		
//	    Vehicle truck1 = new truck();
//		myTollList.add(truck1 );
//	    Vehicle truck2 = new Vehicle();
//		myTollList.add(truck2 );
//	    myTollList.add(truck3);
//	    myTollList.add(car1);
//	    myTollList.add(car2);
//	    myTollList.add(tank);
	    
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
