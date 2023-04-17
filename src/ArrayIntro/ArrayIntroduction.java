package ArrayIntro;

import java.util.Scanner;

public class ArrayIntroduction {
	
	
	int[] primeNumbers= {1,2,3,5,7};
	
	int[] rollNumbers= new int[5];
	
	int[] customerId=new int[5];
	Scanner sc=new Scanner(System.in);
	
	void printArray() {
		
		//rollNumbers[0]=1;
		//rollNumbers[1]=2;
		//rollNumbers[2]=3;
		//rollNumbers[3]=4;
	//	rollNumbers[4]=5;
		
		
		for(int i=0;i<=4;i++) {
        System.out.println("Enter the data ");
        int number=sc.nextInt();
			customerId[i]=number;
		}
		
	}

}
