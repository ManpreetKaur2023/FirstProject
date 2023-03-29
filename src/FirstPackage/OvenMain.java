package FirstPackage;

public class OvenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Oven bajaj = new Oven();
		bajaj.brandname = "Bajaj";
		bajaj.colour = "White";
		bajaj.cost= 100;
		bajaj.glassdoors =true;
		bajaj.type = "Countertop";
		
		bajaj.heat();
		bajaj.bake();
		bajaj.grill();
		
		System.out.println("#### My name is Manpreet Kaur  #####");
		System.out.println("*******Another category of Oven******");
		
		Oven samsung = new Oven();
		samsung.brandname = "Samsung";
		samsung.colour = "Black";
		samsung.cost= 200;
		samsung.glassdoors = false;
		samsung.type = "Wall oven";
		
		
		samsung.heat();
		samsung.bake();
		samsung.grill();
		
	}
	
	

}
