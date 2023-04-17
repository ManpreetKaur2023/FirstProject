package PrintTable;
import java.util.Scanner;


public class PrintTable {

	int number;
	int answer;
	
	Scanner sc =new Scanner(System.in);
		
	void printTableOfAnyNumber() {
		
		System.out.println("Enter number");
		number=sc.nextInt();
		
		for(int counter=1;counter<=10;counter++) {
			answer=number*counter;
			System.out.println(number+ " * " +counter + " = " +answer);
			
		}
	}
	
	}
	
	

