package bankdetails;

import java.util.Scanner;

public class BankTransaction implements BankProcess {
	Scanner sc = new Scanner(System.in);
	int balance, withdraw, deposite;

	public void showBalance() {
		System.out.println("Intial balance in the account ");
		balance = sc.nextInt();
	}

	public void withdraw() {
		System.out.println("Enter amount you want to withdraw");
		withdraw = sc.nextInt();
		//balance = balance - withdraw;
		//System.out.println("Balance amount after withdrawel is : " + balance);
	}

	public void remainingBalance() {
		balance = balance - withdraw;
		System.out.println("Remaining balance in the account after withdrawel is : " + balance);
	}

	public void deposite() {
		System.out.println("Enter amount you want to deposite  ");
		deposite = sc.nextInt();
		balance = balance + deposite;
		System.out.println("Balance amount after deposite is : " + balance);
	}

}
