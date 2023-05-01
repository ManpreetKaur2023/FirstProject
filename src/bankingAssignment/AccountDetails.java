package bankingAssignment;

public class AccountDetails {

	private String accountNumber;
	private String nameofAccountHolder;
	private double fundsAvailable;
	private String actualpin = "1234";
	private String onlineBankingPassword = "abcd";

	public double getfundsAvailable() {
		return fundsAvailable;

	}

	boolean getATMPin(String enterdATMPin) {
		boolean flag = false;
		if (actualpin.equals(enterdATMPin)) {
			flag = true;
		}

		return flag;
	}

	boolean getOnlineBankingPassword(String enteredBankingPassword) {
		boolean flag = false;
		if (onlineBankingPassword.equals(enteredBankingPassword)) {
			flag = true;
		}

		return flag;
	}

}
