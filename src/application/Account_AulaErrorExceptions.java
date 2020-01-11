package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;
import exceptions.DomainException;

public class Account_AulaErrorExceptions {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
					
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.next();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		Account acc = new Account(number, holder, balance, withdrawLimit);
		try {	
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.printf("New balance: " +String.format("%.2f", +acc.getBalance()));
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " +e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();
	}

}
