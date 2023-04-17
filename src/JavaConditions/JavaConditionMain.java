package JavaConditions;

public class JavaConditionMain {

	public static void main(String[] args) {
	
		JavaConditions condition =new JavaConditions();
		
		//Question 1 Find greatest number
		condition.findLargestNumber();
		 
		
		 
		// Question 2 Find discount
		 condition.promoCode20=true;
		 condition.originalPrize=400;
		 condition.findDiscount();
		
		 
		//  Question 3 Ontario License
		 condition.age=20;
		 condition.g1License=true;
		 condition.issueLicense();
		 

	}

}
