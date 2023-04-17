package ArrayIntro;

import java.util.Scanner;

public class ArrayDisibleExample {
//Create an array with 10 elements that are divisible by both 3 and 5.
	
	int[] arrays=new int [5];
	int number;

	
	Scanner sc=new Scanner(System.in);
	
	void arrayDivibleBy3And5() {
		
	     for (int i=0;i<arrays.length; i++) {
		System.out.println("Enter the number ");
		number=sc.nextInt();
		
			if(number%3==0 && number%5==0) {
				arrays[i]=number;
			}
			
				else {
			System.out.println("Number is not divisible by 3 and 5  ");
			
			
		}
			
	     }
	
	
	
	}


	
	
}


