package tiny.types.ttaccount;

final public class AccountNumber {
	final private int accountNumber;

	public AccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountNumber other = (AccountNumber) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}
}