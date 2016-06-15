package main;

import account.Account;
import person.Person;

public class Main {
	
	public static void main(String[] args){
		//Common objects instantiation
		
		Account commonAccount = new Account(123456, 5, 10D, 5000D);
		
		String oneName = "Common";
		String otherName = "Person";
		Person commonPerson = new Person(oneName, otherName, 23, 12345678, 87654321, commonAccount);
	}
}
