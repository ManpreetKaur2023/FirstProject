package bankingAssignment;

public class AccountDetails {

	private String accountNumber;
	private String nameofAccountHolder;
	private double fundsAvailable;
	private String actualpin;
	private String onlineBankingPassword;

	public AccountDetails(String accountNumber, String nameofAccountHolder, double fundsAvailable, String actualpin,
			String onlineBankingPassword) {
		super();
		this.accountNumber = accountNumber;
		this.nameofAccountHolder = nameofAccountHolder;
		this.fundsAvailable = fundsAvailable;
		this.actualpin = actualpin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

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
