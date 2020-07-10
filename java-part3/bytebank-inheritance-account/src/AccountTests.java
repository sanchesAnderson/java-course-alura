
public class AccountTests {
	
	public static void main(String[] args) {
		
		Current currentAccount = new Current(2121, 11248);
		currentAccount.deposit(100.0);
		
		Savings savingsAccount = new Savings(9898, 36325);
		savingsAccount.deposit(200.0);
		
		System.out.println("current account balance: " + currentAccount.getBalance());
		System.out.println("savings account balance: " + savingsAccount.getBalance());
		
		currentAccount.transfer(10.0, savingsAccount);
		
		System.out.println("current account new balance: " + currentAccount.getBalance());
		System.out.println("savings account new balance: " + savingsAccount.getBalance());
		
		savingsAccount.transfer(20.0, currentAccount);
		
		System.out.println("current account end balance: " + currentAccount.getBalance());
		System.out.println("savings account edn balance: " + savingsAccount.getBalance());
	}
}
