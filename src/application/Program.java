package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale. US);
		Scanner sc = new Scanner(System.in);
		
		// Numero da conta
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		// Nome do titular da conta
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		
		// Deseja fazer o deposito inicial
		System.out.print("Is there na initial deposit (Y/N)? ");
		char initialDeposit = sc.next().toUpperCase().charAt(0);	
		
		double depositValue = 0.0;
			if (initialDeposit == 'Y') {
				System.out.print("Enter initial deposit value: ");
				depositValue = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println("Account: " + accountNumber);
		System.out.println("Holder: " + accountHolder);
		System.out.println("Balance: $" + depositValue);
		System.out.println();
		
		System.out.print("Enter deposit value: ");
		double depositValue1 = sc.nextDouble();
		double totalDeposit = depositValue + depositValue1;
		
		System.out.println("Update account data: ");
		System.out.println("Account: " + accountNumber);
		System.out.println("Holder: " + accountHolder);
		System.out.println("Balance: $" + totalDeposit);
		System.out.println();
		
		System.out.print("Enter withdraw value: ");
		double withdrawValue = sc.nextDouble(); 
		double balance = (totalDeposit - withdrawValue) - 5;
		System.out.println("Update account data: ");
		System.out.println("Account: " + accountNumber);
		System.out.println("Holder: " + accountHolder);
		System.out.println("Balance: $" + balance);
		
		
		
		
		
		
		
		
		sc.close();
	}
	
	
	


}
