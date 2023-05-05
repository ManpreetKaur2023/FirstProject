package bankingAssignment;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {
	Scanner sc = new Scanner(System.in);

	double balance;
	String password;
	String updatedPassword;

	public OnlineBanking(double balance, String password) {
		super();
		this.balance = balance;
		this.password = password;
	}

	@Override
	void withdrawAmount() {
		System.out.println("Select amount to be withdrawn from online Banking :");
		double amountTOBeWithdrawn = sc.nextDouble();
		if (amountTOBeWithdrawn <= balance) {
			balance = balance - amountTOBeWithdrawn;
			System.out.println(balance);
		} else {
			System.out.println("Not enough balance");
			System.exit(0);
		}
	}

	@Override
	void depositAmount() {
		System.out.println("Select amount to be deposited");
		double amounttoToBeDeposited = sc.nextDouble();
		balance = balance + amounttoToBeDeposited;
		System.out.println(balance);
	}

	@Override
	void viewBalance() {
		System.out.println("Balance in account: " + balance);
	}

	@Override
	public void changePinPassword() {
		System.out.println("You can reset your Online Banking Password");
		System.out.println("Enter new Password");
		updatedPassword = sc.next();
		if (updatedPassword.equals(password)) {
			System.out.println("Old and new password should be different");

		}
		else if(updatedPassword.length() < 8) {
			System.out.println("Pin should have atleast 8 charcters");
			
		}
		

//		else if (updatedPassword.length() >= 8 && updatedPassword.contains("@") && updatedPassword.contains("$")  && updatedPassword.contains("&")) {
//			System.out.println("Your update Online Banking Password is: "+updatedPassword);
//
//		}
		if(updatedPassword.matches("&,@,$")) {
System.out.println(updatedPassword);
	}}

}
