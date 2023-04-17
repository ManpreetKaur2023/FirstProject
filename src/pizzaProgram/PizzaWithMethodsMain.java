package pizzaProgram;

import java.util.Scanner;

public class PizzaWithMethodsMain {

	public static void main(String[] args) {
		PizzaWithMethods pizza =new  PizzaWithMethods();
		Scanner sc= new Scanner(System.in);
		System.out.println("Select size of the pizza from small,medium and large..");
		String size=sc.nextLine();
		pizza.selectSize(size);
		System.out.println("Do you want peproni topping (y/n)....");
		String topping=sc.nextLine();
		pizza.selectTopping(topping, size);
		 System.out.println("Do you want extra cheese?(y/n) ");
		String extraCheese=sc.nextLine();
		pizza.extraCheese(extraCheese);
		System.out.println("The final price is "+pizza.prize);
		
	
		
	}

}
