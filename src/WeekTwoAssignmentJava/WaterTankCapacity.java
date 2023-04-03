package WeekTwoAssignmentJava;

public class WaterTankCapacity {
	
	
	
	int initialWaterInTank=0;
	int counter;
	
	void fillTankToItsCapacity() {
		
		for( counter=1;counter<=10;counter++) {
			initialWaterInTank=initialWaterInTank+10;
			System.out.println("Water in tank after "+counter+" bucket = " +initialWaterInTank + " litres");
		}
			if(counter==11) {
				System.out.println("Stop pouring the water.Otherwise it will overflow");
			}
			
		
		
	}

}
