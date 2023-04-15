package AccountManaagement;

import java.util.Scanner;

public class AccountOperation {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. To view current balance \n2. To add balance \n3. To withdraw balance");
		ManageAccount account = new ManageAccount();
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("The balance is: ");
			account.viewBalance();
			break;

		case 2:
			account.addBalance();
			break;

		case 3:
			account.withdrawBalance();
			break;

		}
	}


}
