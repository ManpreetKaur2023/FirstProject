package WeekTwoAssignmentJava;

public class addingChoclate {

	int initialChoclateInBox=27;
	int counter;
	
	void addChoclate() {
		
		for(counter=1;counter<=7;counter++) {
			
			  initialChoclateInBox =initialChoclateInBox+5;
			 System.out.println("Choclates after " +counter +" round are " + initialChoclateInBox);

		}
		
		if(counter==8) {
			System.out.println(" Cannot add choclates as number of choclates is exceeding 63");
		}
		
	}
	
}
