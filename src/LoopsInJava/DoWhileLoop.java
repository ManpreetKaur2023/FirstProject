package LoopsInJava;

public class DoWhileLoop {

	int number;
	
	void doWhileLoop() {
		int finalNumber=number+5;
		
		do {
			System.out.println(number);
			number++;
			
		}while(number<=finalNumber);
		
	}
	
}
