package JavaConditions;

public class JavaConditions {

	//Question 1 Find greatest number
	
	int number1 = 15;
	int number2 = 44;
	int number3 = 10;
	
	void findLargestNumber() {
		
		if(number1>number2)
		{
			  if (number1>number3)
			  {
				  System.out.println("Largest number is " +number1);
				  
			  }
		}
			  else if(number2>number3)
			  {
				  
				  if(number2>number1) 
				  {
					System.out.println("Largest number is " +number2);
				}
		}
		 
		else
		{
			System.out.println("Largest number is " +number3);
		}
		
	}
	
	
	// Question 2 Find discount
	
	
	double discount ;
	boolean promoCode5;
	boolean promoCode10;
	boolean promoCode20;
	double originalPrize;
	
	
	
	void findDiscount()
	{
		if(promoCode5)
		{
			discount=originalPrize*0.55;
			System.out.println("User will get 55 % of discount that is"  +discount);
		}
		
		else if(promoCode10)
		{
			discount=originalPrize*0.6;
			System.out.println("User will get 60 % of discount that is " +discount);
		}
		
		else if(promoCode20)
		{
			discount=originalPrize*0.7;
			System.out.println("User will get 70 % of discount that is " +discount);
		}
		
		else
		{
			discount=originalPrize*0.5;
			System.out.println("User will get 50% discount that is :" +discount);
		}
			
	}
	
	
	
	//  Question 3 Ontario License
	
	int age;
	boolean noLicense ;
	boolean g1License;
	boolean g2License;
	
	
	void issueLicense() {
		
		if (age>=18) 
		{
			
			if(noLicense)
			{
				System.out.println("G1 license will be isued to the person.");	
				
			}
			
			else if (g1License)
			{
				System.out.println("G2 license will be issued to the person");	
			}
			
			else if(g2License) 
			{
				System.out.println("G license will be issued to the person");
			}
			
		else
		{
			System.out.println("Age is less than 18 so cannot get the license");
		}
	}
	}
	
}
