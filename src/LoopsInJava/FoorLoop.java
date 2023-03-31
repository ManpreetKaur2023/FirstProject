package LoopsInJava;

public class FoorLoop {
	
	int actualPin;
	int enteredPin;
	
	void checkPinIsCorrect() {
		
		for(int counter=1 ; 
				counter<=3;
				counter++)
		{
			if(actualPin==enteredPin)
			{
			    System.out.println("Pin is correct");
			break;
			}
			
			else
			{
				System.out.println("Pin is incorrect");
			}
			
			
		}
		
		}
		
	}
	


