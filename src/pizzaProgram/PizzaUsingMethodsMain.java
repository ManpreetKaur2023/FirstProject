package pizzaProgram;

import java.util.Scanner;

public class PizzaUsingMethodsMain {

	public static void main(String[] args) {
		PizzaUsingMethods pizza=new PizzaUsingMethods();
		Scanner sc=new Scanner(System.in);
		 System.out.println("Select size of the pizza..");
		String size=sc.nextLine();
		System.out.println("Do you want Pepperoni Topping..");
		String topping=sc.nextLine();
		 System.out.println("Do you want extra cheese ?");
		String extraCheese=sc.nextLine();
		pizza.calculateBill(size, topping, extraCheese);
		//pizza.calculateBill("small", "y", "n");
	}

}
