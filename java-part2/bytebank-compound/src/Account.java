public class Account {
	private double balance;
	private int agency;
	private int number;
	Client holder;
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public boolean withdraw(double value) {
		
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		}
		
		return false;
	}
	
	public boolean transfer(double value, Account depositAccount) {

		if (this.balance >= value) {
			this.withdraw(value);
			depositAccount.deposit(value);
			return true;
		}
		
		return false;
	}
	
	public double getBalance() {
		return this.balance;
	}
}