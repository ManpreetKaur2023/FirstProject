package WeekTwoAssignmentJava;
import java.util.Scanner;
public class WaterTankCapacity {
	
	
	
	int initialWaterInTank;
	int bucketCapacity;
	Scanner sc =new Scanner(System.in);
	
	void fillTankToItsCapacity() {
		
			while(initialWaterInTank <=100-10) {
			System.out.println("Water Level in tank now.." +initialWaterInTank);
			System.out.println("We can fill water:");
			System.out.println("Press 1 to fill one bucket");
			bucketCapacity=sc.nextInt();
			
			
			if(bucketCapacity==1) {
				initialWaterInTank= initialWaterInTank+10;
				System.out.println(initialWaterInTank);
				
			}
			
			else
			{
				System.out.println("wrong selection....");
				break;
			}
	}
		if (initialWaterInTank>=100) {
			System.out.println("Tank is full");
		}
	
	}
	

}
