package WeekTwoAssignmentJava;



public class switchMain {

	public static void main(String[] args) {
		
		Switchprogram calculator=new Switchprogram();
		
		calculator.number1=2;
		calculator.number2=2;
		
		String operation="multiply";
		
		switch(operation) {
		case"add":
			calculator.sum();
			break;
		case"subtract":
			calculator.difference();
			break;
		case"multiply":
			calculator.product();
			break;
		case"divide":
			calculator.quoitent();
			break;
		case"remainder":
			calculator.remainder();
			break;
		case"square":
			calculator.square();
			break;
		case"cube":
			calculator.cube();
			default:
				System.out.println("Select correct method.");
		}
		
		
		
	}

}
