package entities;

public class Client {
	
	private int number;
	private String holder;
	private double balance;
	
	public Client(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Client(int number, String holder, double initalDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initalDeposit);
	}

	public int getNumber() {
		return number;
	}


	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString( ) {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
				
	}
	
	

	
}
