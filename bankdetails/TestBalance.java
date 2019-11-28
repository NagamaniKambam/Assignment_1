package bankdetails;

public class TestBalance extends BankTransaction  {
   public static void main(String[] args) {
	  BankProcess b = new TestBalance();
	  b.showBalance();
	  b.withdraw();
	  b.remainingBalance();
	  b.deposite();
   }
}
