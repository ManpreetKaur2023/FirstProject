package FirstPackage;

public class Oven {

	String brandname;
	int size;
	String colour;
	String type;
	int cost;
	boolean glassdoors;
	
	void heat() {
		System.out.println("Heating food from my " +  brandname  +" oven  and cost of oven is " +cost);
	}
	
	void bake() {
		System.out.println("I can bake cakes in " + brandname+" oven.");
	}
	
	void grill() {
		System.out.println("The colour of the oven is  "+  colour  +" which is of " +  type  +  " type. ");
		
	}
	
}
