package bankingAssignment;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {
	Scanner sc = new Scanner(System.in);

	double balance;

	public OnlineBanking(double balance) {
		super();
		this.balance = balance;
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

}
