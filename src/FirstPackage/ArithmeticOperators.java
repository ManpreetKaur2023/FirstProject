package FirstPackage;

public class ArithmeticOperators {
   int a;
   int b;
   int c;
   
   void sum()
{ 
	   c= a+b;
	   System.out.println("sum of " + a +" and " +b +" is = "+c );
	   }
   
   void difference() {
	   c= a-b;
	   System.out.println("Difference of " + a +" and " +b +" is = "+c);
   }
   
   void product() {
	   c= a*b;
	   System.out.println("Product of " + a +" and " +b +" is = "+c);
   }
   
   void quoitent() {
	   c= a/b;
	   System.out.println("quotient of " + a +" and " +b +" is = "+c);
   }
   
   void remainder() {
	   c= a%b;
	   System.out.println("Remainder of " + a +" and " +b +" is = "+c);
   }
}
