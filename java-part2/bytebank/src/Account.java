public class Account {
	double balance;
	int agency;
	int number;
	String holder;
	
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
}