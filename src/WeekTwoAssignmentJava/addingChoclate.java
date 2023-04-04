package WeekTwoAssignmentJava;
import java.util.Scanner;

public class addingChoclate {

	int initialChoclateInBox;
	int addMoreChoclate;
	Scanner sc=new Scanner(System.in);
	
	
	void addChoclate() {
		
		while(initialChoclateInBox<=63-5) {
			System.out.println("Number of choclates now in box is " +initialChoclateInBox);
			System.out.println("You can add more choclates");
			System.out.println("Press 1 to add more choclates");
			addMoreChoclate=sc.nextInt();
			
			if(addMoreChoclate==1) {
				initialChoclateInBox+=5;
				System.out.println( +initialChoclateInBox);
			}
			
			else {
				System.out.println("Wrong selection");
				break;
			}
		}
			
			if(initialChoclateInBox>=63) {
				System.out.println("Cannot add more choclates as box is filled already");
			}
			
		
		
	}
	
}
