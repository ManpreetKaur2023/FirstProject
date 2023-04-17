package methodsExamples;

import java.util.Scanner;

public class MethodsExamplesMain {

	public static void main(String[] args) {
		MethodsExamples  methodexample=new MethodsExamples();
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Pin ..");
		int enteredPin=sc.nextInt();
		
		boolean isPinCorrect= methodexample.accountValidate(enteredPin);
		if(isPinCorrect) {
			System.out.println("Enter withdrawl amount");
			int withdrawAmount=sc.nextInt();
			 methodexample.withdrawAmount(withdrawAmount);
		}
		else {
			System.out.println("Pin is incorrect");
		}
		
       
       // methodexample.printCustomerInfo("Manpreet", 20000);
	}

}
