package bankingAssignment;

import java.util.Scanner;

public class BankingOperationsMain {

	public static void main(String[] args) {

		BankOperations bankingOperations = null;
		AccountDetails accountDetails = new AccountDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Which opertaion do you want to perform(ATM or OnlineBanking)");
		String operation = sc.next();

		switch (operation) {
		case "ATM":
			System.out.println("Enter ATM pin");
			String enteredATMPin = sc.next();

			boolean pin = accountDetails.getATMPin(enteredATMPin);
			if (pin) {
				bankingOperations = new ATM();
			} else {
				System.out.println("Incorrect PIN");
				System.exit(0);
			}
			break;

		case "OnlineBanking":
			System.out.println("Enter Online Banking  Password");
			String enteredBankingPin = sc.next();

			boolean password = accountDetails.getOnlineBankingPassword(enteredBankingPin);
			if (password) {

				bankingOperations = new OnlineBanking();
			} else {
				System.out.println("Incorrect Password");
				System.exit(0);
			}
			break;

		default:
			System.out.println("Select correct Action");
			System.exit(0);
			break;
		}

		System.out.println("Deposit or Withdrawl");
		String actionToBePerformed = sc.next();

		if (actionToBePerformed.equals("Withdrawl")) {
			bankingOperations.withdrawAmount();
			bankingOperations.viewBalance();
		} else if (actionToBePerformed.equals("Deposit")) {
			bankingOperations.depositAmount();
			bankingOperations.viewBalance();

		} else {
			System.out.println("Incorrect action.");
		}

	}

}
