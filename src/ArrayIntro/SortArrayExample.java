package ArrayIntro;

import java.util.Scanner;

public class SortArrayExample {
	
	int[] rollNumber=new int [5];
	Scanner sc =new Scanner(System.in);
	
	void populateRollNumber() {
		for(int i=0;i<rollNumber.length;i++) {
		System.out.println("Enter Roll Number....");
			rollNumber[i]=sc.nextInt();	
		}
	}
	
	
	void printUnSortedArray() {
		System.out.println("Unsorted Array....");
		for(int i=0;i<rollNumber.length;i++) {
			System.out.println(rollNumber[i]);
		}
		
		System.out.println("Reversed Array.....");
		for (int i=rollNumber.length-1;i>=0;i--) {
			System.out.println(rollNumber[i]);	
		}
	}
	
	void sortedarray() {
		int sortVariable=0;
		System.out.println("Sorted array....");
		for(int i=0;i<rollNumber.length;i++) {
			for(int j=i+1;j<rollNumber.length;j++) {
				if(rollNumber[i]>rollNumber[j]) {
					sortVariable=rollNumber[i];
					rollNumber[i]=rollNumber[j];
					rollNumber[j]=sortVariable;
					
				}
				
				
				
			}
			System.out.println(rollNumber[i]);
		}
		
	}
	
	
	void findLargestRollNumber() {
		int largest=rollNumber[0];
		for(int i=0;i<rollNumber.length;i++) {
			if(rollNumber[i]>largest) {
				largest=rollNumber[i];
			}
			
			
		}
		System.out.println("Largest number is " +largest);
	}
	

}
