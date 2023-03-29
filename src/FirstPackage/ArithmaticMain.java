package FirstPackage;

public class ArithmaticMain {

	public static void main(String[] args) {
		ArithmeticOperators aop = new ArithmeticOperators();
		
		//Arithmetic  Operators
		aop.a= 8;
		aop.b=4;
		aop.sum();
		aop.difference();
		aop.product();
		aop.quoitent();
        aop.remainder();
        
        //Assignment  Operators
        AssignmentOperators asop =new AssignmentOperators();
        asop.addassign();
        asop.minusassign();
	}

}
