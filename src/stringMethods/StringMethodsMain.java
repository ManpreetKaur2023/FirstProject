package stringMethods;

public class StringMethodsMain {

	public static void main(String[] args) {
		
	StringMethods stringMethods=new StringMethods();
		
	boolean cityFound=	stringMethods.searchCityName("Hamilton");
	if(cityFound) {
		System.out.println("City name found");
	}
	else {
		System.out.println("City not found in the city");
	}
	
	System.out.println("City names with ton....");
    stringMethods.cityNameWithTon();

    System.out.println("Updated city names with fun");
    stringMethods.replaceTonWithFun();

    System.out.println("*****Address......****");
    stringMethods.extractingAddressString();
	}

	
	

}

