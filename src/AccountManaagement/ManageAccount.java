package AccountManaagement;

import java.util.Scanner;

public class ManageAccount {
	
	Scanner scanner = new Scanner(System.in); // create object

	static String name;
	private static int balance = 10000;

	public void viewBalance() {
		System.out.println(balance);

	}

	public void addBalance() {
		System.out.println("Please enter the amount to add: ");
		int amount = scanner.nextInt();
		balance = balance + amount; 

		System.out.println("The updated account balance is: " + balance);
	}

	public void withdrawBalance() {
		System.out.println("Enter the amount to be withdraw: ");
		int amount = scanner.nextInt();
		if (amount <= 0) {
			System.out.println("Enter valid amount for withdraw: ");

		} else if (amount <= balance) {
			System.out.println("Withdraw is under process \nWithdraw process is successfull..");
			balance = balance - amount; 
			System.out.println("Updated balance is = " + balance);
		} else {
			System.out.println("Insufficient balance...");
		}
		
	}
	
}
