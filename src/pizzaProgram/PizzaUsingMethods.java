package pizzaProgram;

public class PizzaUsingMethods {
	double prize;
	
	void calculateBill(String size,String topping,String extraCheese) {
		 if(size.equals("small")) {
			 prize=15;
		 }
		 else if (size.equals("medium")) {
			 prize=20;
		 }
		 else  if (size.equals("large")) {
			 prize=25;
		 }
		 
		 else {
			 System.out.println("Select correct size...");
			 
		 }
	
	
	if(topping.equals("y") && size.equals("small")) {
		 prize=prize+2;
	 }
	 else if(topping.equals("y") && size.equals("medium")){
		prize=prize+3; 
	 }
	 else if(topping.equals("y") && size.equals("large")){
			prize=prize+3;
	 
}
	
	if (extraCheese.equals("y")) {
		 prize=prize+1;
	 }
	 
	 
	 System.out.println("Your final Bill is $ " +prize);
	
}}
