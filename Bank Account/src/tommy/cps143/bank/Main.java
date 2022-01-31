package tommy.cps143.bank;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
	public static void main(String args[])
	{
		int randAccNum = ThreadLocalRandom.current().nextInt(00000000, 99999999);
		int randAccPIN = ThreadLocalRandom.current().nextInt(0000, 9999);
		
		System.out.println("Creating Demo Account...\n");
		Account account = new Account();
		account.setCustomerName("John Doe");
		account.setAccountNumber(randAccNum);
		account.setAccountPIN(randAccPIN);
		account.setAccountBalance(Math.random() * 1000);
		
		System.out.printf("%s\n", account.toString());
		
		System.out.print("Running Function Tests...\n");
		account.deposit(Math.random() * 100);
		account.withdrawal(Math.random() * 100);
		
		System.out.println("\nFinished running test removing object...");
		account = null;
	}
}
