package StockAccountManagement;

import java.util.Scanner;

public class Portfolio extends StockAccount {

	public static void main(String[] args) {

		System.out.println("Enter the total number of Stocks");
		Scanner scanner = new Scanner(System.in);

		setNoOfStocks(scanner.nextInt());
		for (int i = 1; i <= getNoOfStocks(); i++) {
			StockAccount stock = new StockAccount();
			stock.addShare();
			TotalValue += StockPrice;
		}
		
		System.out.println("\nTotal Value is " + TotalValue);
	}

}
