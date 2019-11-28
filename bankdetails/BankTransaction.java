package bankdetails;

import java.util.Scanner;

public class BankTransaction implements BankProcess {
	Scanner sc = new Scanner(System.in);
	int balance, withdraw, deposite;

	public void showBalance() {
		System.out.println("Intial balance in the account ");
		balance = sc.nextInt();
		System.out.println("");
	}

	public void withdraw() {
		System.out.println("Enter amount you want to withdraw");
		withdraw = sc.nextInt();
        if(balance >= withdraw)
        {
            balance = balance - withdraw;
            System.out.println("Withdraw amount is : "+ withdraw);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        System.out.println("");
	}

	public void remainingBalance() {
		//balance = balance - withdraw;
		System.out.println("Remaining balance in the account is : " + balance);
		System.out.println("");
	}

	public void deposite() {
		System.out.println("Enter amount you want to deposite  ");
		deposite = sc.nextInt();
		balance = balance + deposite;
        System.out.println("Your Money has been successfully depsited");
        System.out.println("Balance amount after deposited : " + balance);
	}

}
