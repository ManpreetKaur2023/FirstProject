package WeekTwoAssignmentJava;

public class Switchprogram {
	
	int number1;
	int number2;
	int result;
	   
	   void sum()
	{ 
		  result=number1+number2;
		   System.out.println("sum of " + number1 +" and " +number2 +" is = "+result );
		   }
	   
	   void difference() {
		   result=number1-number2;
		   System.out.println("Difference of " + number1 +" and " +number2 +" is = "+result);
	   }
	   
	   void product() {
		  result=number1*number2;
		   System.out.println("Product of " + number1 +" and " +number2 +" is = "+result);
	   }
	   
	   void quoitent() {
		   result=number1/number2;
		   System.out.println("quotient of " + number1 +" and " +number2 +" is = "+result);
	   }
	   
	   void remainder() {
		  result=number1%number2;
		   System.out.println("Remainder of " + number1 +" and " +number2 +" is = "+result);
	   }
	   
	   void square() {
		   result=number1*number1;
		   System.out.println("Square of "+ number1 + " is " +result);
	   }

	   void cube() {
		   result=number1*number1*number1;
		   System.out.println("Square of "+ number1 + " is " +result);
	   }
}
