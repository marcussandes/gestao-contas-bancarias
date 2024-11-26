package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale. US);
		Scanner sc = new Scanner(System.in);
		Client account;
		
		
		
		// Numero da conta
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		// Nome do titular da conta
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		
		// Deseja fazer o deposito inicial
		System.out.print("Is there na initial deposit (Y/N)? ");
		char response = sc.next().toUpperCase().charAt(0);	
			if (response == 'Y') {
				System.out.print("Enter initial deposit value: ");
				double initialDeposit = sc.nextDouble();
				account = new Client(number, holder, initialDeposit);
		}
			else {
				account = new Client(number, holder);
			}
			
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data:");
		System.out.println(account);
		
		sc.close();
	}
	
	
	


}
