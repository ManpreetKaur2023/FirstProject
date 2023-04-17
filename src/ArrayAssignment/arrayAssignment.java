package ArrayAssignment;

import java.util.Scanner;

public class arrayAssignment {
	
	String[] samsungMobiles= {"S20" , "S21" , "Flip3" , "Fold3"};
	String[] googleMobiles= {"Google Pixel 6" , "Google Pixel 6 Pro" , "Google Pixel Pro" , "Google Pixel 5"};
	String[] appleMobiles= {"Iphone 12" , "Iphone 12 Mini" , "Iphone 11" , "Iphone Pro"};
	
	String selectOption;
	String enterProductName;
	
	Scanner sc=new Scanner(System.in);
	
	void showAvailableProducts() {
		
		System.out.println("Enter Brand Name..");
		selectOption=sc.nextLine();
		
		if(selectOption.equals("samsung")) {
			System.out.println("List of available products...... " );
			for(int i=0;i<samsungMobiles.length;i++) {
				System.out.println(samsungMobiles[i]);	
				
			}
			
		}
		else if(selectOption.equals("google")) {
			System.out.println("List of available products " );
			for(int i=0;i<googleMobiles.length;i++) {
			System.out.println(googleMobiles[i]);

		}
		}
		
		else if(selectOption.equals("apple")) {
			System.out.println("List of available products " );
			for(int i=0;i<appleMobiles.length;i++) {
				System.out.println(appleMobiles[i]);
			}	
		}
		else {
			System.out.println("Wrong Selection......");
			
		}
	}
	
	void showProductName() {
		 System.out.println("Select the product ....");
		  String enterProductName=sc.nextLine();
		 
		for(int i=0;i<samsungMobiles.length;i++) {
			if(enterProductName.equals(samsungMobiles[i])) {
				System.out.println("Product selected is " +samsungMobiles[i]);
				break;
			}
			else {
				System.out.println("Please select a product from the list...");
				break;
			}
			
			
		}
				
		for(int i=0;i<googleMobiles.length;i++) {
			 if(enterProductName.equals(googleMobiles[i])) {
				System.out.println("Product selected is " +googleMobiles[i]);
				break;
				
			}
			 else {
					System.out.println("Please select a product from the list...");
					break;
					
				}	 
		
		}
			 
			 for(int i=0;i<appleMobiles.length;i++) {
			 if (enterProductName.equals(appleMobiles[i])){
				System.out.println("Product selected is " +appleMobiles[i]);
				break;
				
			}
			 else {
					System.out.println("Please select a product from the list...");
					break;
					
				}
			 }
			 
			
		}}


