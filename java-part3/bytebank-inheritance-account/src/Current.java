
public class Current extends Account {
	
	private double tax = 0.20;
	
	public Current(int agency, int number) {
		
		super(agency, number);
	}
	
	@Override
	public boolean withdraw(double value) {
		
		super.setBalance(super.getBalance() - this.getTax());
		System.out.println("saldo parcial: " + super.getBalance());
		return super.withdraw(value);
		
	}
	
	@Override
	public void deposit(double value) {
		
		super.setBalance(super.getBalance() + value);
		
	}
	
	public double getTax() {
		return tax;
	}
}
