package pizzaProgram;

import java.util.Scanner;

public class PizzaProgram {
	
	String size;
	String topping;
	String extraCheese;
	double prize;
	
	Scanner sc=new Scanner(System.in);
	 void calculateBill() {
		 
		 System.out.println("Select size of the pizza..");
		 size=sc.nextLine();
		
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
		 
		 System.out.println("Do you want Pepperoni Topping..");
		 topping=sc.nextLine();
			 
		 if(topping.equals("y") && size.equals("small")) {
			 prize=prize+2;
		 }
		 else if(topping.equals("y") && size.equals("medium")){
			prize=prize+3; 
		 }
		 else if(topping.equals("y") && size.equals("large")){
				prize=prize+3;
		 
	 }
		 System.out.println("Do you want extra cheese ?");
		 extraCheese=sc.nextLine();
		 if (extraCheese.equals("y")) {
			 prize=prize+1;
		 }
		 
		 
		 System.out.println("Your final Bill is $ " +prize);

}}
