package accessSpecifier;

public class AccessSpecifierExample {
	// customerName and customerPassword variable can be accessed outside this class
	// as they are default but within the package only.
	String customerName = "Manpreet";
	String customerPassword = "abcd";

	// balance variable cannot be accessed outside this class as it is declared as
	// private.so its scope is limited to this class only.
	private double Balance;

	public int customerAge = 23;

	public void showCustomerInformation() {

		System.out.println("Customer Name is: " + customerName);
		System.out.println("Customer password is: " + customerPassword);
	}

}
