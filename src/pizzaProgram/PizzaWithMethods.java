package pizzaProgram;

public class PizzaWithMethods {

	double prize=0.0;
	
	void selectSize(String size) {
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
	}
	
	void selectTopping(String topping,String size) {
		
		 if(topping.equals("y") && size.equals("small")) {
			 prize=prize+2;
		 }
		 else if(topping.equals("y") && size.equals("medium")){
			prize=prize+3; 
		 }
		 else if(topping.equals("y") && size.equals("large")){
				prize=prize+3;
	 }
		 
	}
	
	void extraCheese(String extraCheese) {
		 if (extraCheese.equals("y")) {
			 prize=prize+1;
		 }
		 
		
	}
	
}
