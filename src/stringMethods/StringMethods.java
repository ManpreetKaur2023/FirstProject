package stringMethods;

public class StringMethods {
	
	String[] cityNames= {"Toronto","Ottawa","Brampton","Hamilton","London","Mississauga","Burlington","Kingston","Kitchener"};
	
	
	
	boolean searchCityName( String enteredCity) {
		boolean flag=false;
			for(int i=0;i<cityNames.length;i++)	{
		if(cityNames[i].equalsIgnoreCase(enteredCity)) {
		    flag=true;
}
}
			return flag;
			}
	
	
	void cityNameWithTon() {
		for(int i=0;i<cityNames.length;i++) {
			if(cityNames[i].contains("ton")) {
				System.out.println(cityNames[i]);
			}
		}
	}
	
	void replaceTonWithFun() {
	for(int i=0;i<cityNames.length;i++) {
		if(cityNames[i].contains("ton")) {
		cityNames[i]=cityNames[i].replaceAll("ton", "fun");
		System.out.println(cityNames[i]);
			
		}
	}
	}
	
	void extractingAddressString() {
		String address="100 queen street,Toronto,M5V 3E3";
		
		String streetAdress=address.substring(0, 16);
		System.out.println("Street Addresss:"+streetAdress);
		
		String city=address.substring(17, 24);
		System.out.println("City Name:"+city);
		
		String zipCode=address.substring(25);
		System.out.println("Zip Code :"+zipCode);
		
		
	}
	
	
	
	}