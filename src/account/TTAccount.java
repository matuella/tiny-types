package account;

import tiny.types.ttaccount.AccountNumber;
import tiny.types.ttaccount.Balance;
import tiny.types.ttaccount.BranchNumber;
import tiny.types.ttaccount.DailyWithdrawLimit;

public class TTAccount {

	private AccountNumber accountNumber;
	private BranchNumber branchNumber;
	private Balance balance;
	private DailyWithdrawLimit dailyWithdrawLimit;

	public TTAccount(AccountNumber accountNumber, BranchNumber branchNumber, Balance balance,
			DailyWithdrawLimit dailyWithdrawLimit) {
		this.accountNumber = accountNumber;
		this.branchNumber = branchNumber;
		this.balance = balance;
		this.dailyWithdrawLimit = dailyWithdrawLimit;
	}

	public AccountNumber getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(AccountNumber accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BranchNumber getBranchNumber() {
		return branchNumber;
	}

	public void setBranchNumber(BranchNumber branchNumber) {
		this.branchNumber = branchNumber;
	}

	public Balance getBalance() {
		return balance;
	}

	public void setBalance(Balance balance) {
		this.balance = balance;
	}

	public DailyWithdrawLimit getDailyWithdrawLimit() {
		return dailyWithdrawLimit;
	}

	public void setDailyWithdrawLimit(DailyWithdrawLimit dailyWithdrawLimit) {
		this.dailyWithdrawLimit = dailyWithdrawLimit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((branchNumber == null) ? 0 : branchNumber.hashCode());
		result = prime * result + ((dailyWithdrawLimit == null) ? 0 : dailyWithdrawLimit.hashCode());
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
		TTAccount other = (TTAccount) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (branchNumber == null) {
			if (other.branchNumber != null)
				return false;
		} else if (!branchNumber.equals(other.branchNumber))
			return false;
		if (dailyWithdrawLimit == null) {
			if (other.dailyWithdrawLimit != null)
				return false;
		} else if (!dailyWithdrawLimit.equals(other.dailyWithdrawLimit))
			return false;
		return true;
	}
}