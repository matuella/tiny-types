package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.account.TTAccount;
import model.person.TTPerson;
import model.tiny.types.ttaccount.AccountNumber;
import model.tiny.types.ttaccount.Balance;
import model.tiny.types.ttaccount.BranchNumber;
import model.tiny.types.ttaccount.DailyWithdrawLimit;
import model.tiny.types.ttperson.Age;
import model.tiny.types.ttperson.FirstName;
import model.tiny.types.ttperson.LastName;
import model.tiny.types.ttperson.MobilePhone;
import model.tiny.types.ttperson.Phone;

public class BankMenu {

	final private List<TTPerson> registeredPeople = new ArrayList<TTPerson>();
	private int counter;

	public BankMenu() {
		mainMenu();
	}

	private void mainMenu() {
		final Scanner inputReader = new Scanner(System.in);
		int option = 0;

		while (option != 6) {
			System.out.println("|----------------------------|");
			System.out.println("|     Welcome to TTBank!     |");
			System.out.println("|                            |");
			System.out.println("|   Choose an action with    |");
			System.out.println("|   its respective number    |");
			System.out.println("|----------------------------|");
			System.out.println("|                            |");
			System.out.println("|1 - Register Person         |");
			System.out.println("|2 - List Registered People  |");
			System.out.println("|3 - Deposit Money           |");
			System.out.println("|4 - Withdraw Money          |");
			System.out.println("|5 - Transfer between Persons|");
			System.out.println("|6 - Exit Application        |");
			System.out.println("|                            |");
			System.out.println("|----------------------------|\n");

			try {
				option = inputReader.nextInt();
				pickAction(option);
			} catch (Exception e) {
				System.out.println("Something went wrong!\n It was a :" + e.toString());
			}
		}

		inputReader.close();
	}

	private void pickAction(int option) {
		switch (option) {
		case 1:
			registerPerson();
			break;

		case 2:
			listRegistered();
			break;

		case 3:
			depositMoney();
			break;

		case 4:
			withdrawMoney();
			break;

		case 5:
			transferMoney();
			break;

		case 6:
			System.out.println("Application finalized.");
			break;

		default:
			System.out.println("Invalid option.");
			break;
		}
	}

	private void registerPerson() {
		TTAccount tinyTypeAccount = new TTAccount(new AccountNumber(12345 + counter), new BranchNumber(5),
				new Balance(10D), new DailyWithdrawLimit(5000D));
		TTPerson tinyTypePerson = new TTPerson(new FirstName("Tiny" + counter), new LastName("Type Person"),
				new Age(28), new Phone(12345678), new MobilePhone(87654321), tinyTypeAccount);
		
		counter++;
		registeredPeople.add(tinyTypePerson);
	}

	private void listRegistered() {
		if (!registeredPeople.isEmpty()) {
			registeredPeople.stream().forEach(System.out::println);
		} else {
			System.out.println("No one is registered.");
		}
	}

	private void depositMoney() {

	}

	private void withdrawMoney() {

	}

	private void transferMoney() {

	}
}
