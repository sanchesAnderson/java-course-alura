
public class ControlBonus {
	
	private double sum;
	
	public void register(Employee employee) {
		
		double bonus = employee.getBonus();
		this.setSum(+bonus);
	}
	
	public double getSum() {
		return sum;
	}
	
	public void setSum(double sum) {
		this.sum = sum;
	}
}
