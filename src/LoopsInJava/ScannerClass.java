package LoopsInJava;
import java.util.Scanner;

public class ScannerClass {

	int actualPin=1234;
	int enteredPin;
	double balance=5000;
	double withdrawAmount;
	int counter;
	
	Scanner sc =new Scanner(System.in);
	
	void checkPinIsCorrectUsingScanner() {
		
		for(int counter=1 ; counter<=3;counter++)
		{
			System.out.println("Enter the Pin");
			enteredPin=sc.nextInt();
			if(actualPin==enteredPin)
			{
			    System.out.println("Pin is correct");
			    System.out.println("Enter withdraw amount");
			    withdrawAmount=sc.nextDouble();
			    if(withdrawAmount<balance)
			    {
			    	System.out.println("You can withdraw amount");
			    }
			    else 
			    {
			    	
			    System.out.println("You have less balance");
			    }
			break;
			}
			
			else
			{
				System.out.println("Pin is incorrect");
				
			}
			
			}
			
		do {
			System.out.println("Card is blocked");
		}while(counter==4);
			
			
			
		}
		
	
		
	
}

