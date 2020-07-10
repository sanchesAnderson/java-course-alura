
public class Savings extends Account {
	
	public Savings(int agency, int number) {

		super(agency, number);
	}

	@Override
	public void deposit(double value) {
		
		super.setBalance(super.getBalance() + value);
		
	}
	
	
}
