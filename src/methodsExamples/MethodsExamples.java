package methodsExamples;

public class MethodsExamples {
	
	double balance=5000.55;
	int actualPin=1234;
	
	//Methods with one parameter.....
	void withdrawAmount(int withdrawAmount) {
		if(balance>withdrawAmount) {
			System.out.println("Customer can withdraw amount");
		}
		else {
			System.out.println("Not enough balance");
		}
	}
	
	//Methods with multiple parameters....
	void printCustomerInfo(String name, int withdrawAmount ) {
		
		System.out.println("Name of the customer is "+name);
		if(balance>withdrawAmount) {
			System.out.println("Customer can withdraw amount");
		}
		else {
			System.out.println("Not enough balance");
		}
		
	}
	
	boolean accountValidate(int enteredPin) {
	boolean isPinCorrect=false;
	if(actualPin==enteredPin) {
		isPinCorrect=true;
	}
	return isPinCorrect;
	

}
	}
