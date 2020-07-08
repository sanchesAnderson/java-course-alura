
public class Manager extends Employee {

	private int password;

	public boolean authenticate(int senha) {

		if (this.getPassword() == senha) {
			return true;
		}

		return false;
	}

	public double getBonus() {

		return super.getSalary() * 0.2;

	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
