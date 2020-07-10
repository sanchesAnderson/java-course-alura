public abstract class Account {
	private double balance;
	private int agency;
	private int number;
	private Client holder;
	private static int total;
	
	public Account(int agency, int number) {
		
		if (this.setAgency(agency) && this.setNumber(number)) {
			System.out.println("new account created with agency " + agency + " and number " + number);	
			Account.total++;
		} else {
			System.out.println("new account cannot be created");
		}
	}
	
	public abstract void deposit(double value);
	
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
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}

	public int getAgency() {
		return agency;
	}

	private boolean setAgency(int agency) {
		if (agency <= 0) {
			System.out.println("agency cannot equal less than 0");
			return false;
		}
		this.agency = agency;
		
		return true;
	}

	public int getNumber() {
		return number;
	}

	private boolean setNumber(int number) {
		if (number <= 0) {
			System.out.println("number cannot equal less than 0");
			return false;
		}
		this.number = number;
		
		return true;
	}
	
	public void setHolder(Client holder) {
		this.holder = holder;
	}
	
	public Client getHolder() {
		return holder;
	}

	public static int getTotal() {
		return Account.total;
	}
	
}