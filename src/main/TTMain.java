package main;

import account.TTAccount;
import person.TTPerson;
import tiny.types.ttaccount.AccountNumber;
import tiny.types.ttaccount.Balance;
import tiny.types.ttaccount.BranchNumber;
import tiny.types.ttaccount.DailyWithdrawLimit;
import tiny.types.ttperson.Age;
import tiny.types.ttperson.FirstName;
import tiny.types.ttperson.LastName;
import tiny.types.ttperson.MobilePhone;
import tiny.types.ttperson.Phone;

public class TTMain {

	public static void main(String[] args){
		//Objects instantiation with Tiny Types
		
		TTAccount tinyTypeAccount = 
				new TTAccount(new AccountNumber(123456), new BranchNumber(5),
						new Balance(10D), new DailyWithdrawLimit(5000D));

		TTPerson tinyTypePerson = 
				new TTPerson(new FirstName("Tiny"), new LastName("Type Person"),
						new Age(23), new Phone(12345678), new MobilePhone(87654321),
						tinyTypeAccount);
	}
}
