
public class Methods {
	
	public static void main(String[] args) {
		
		Account accountJohn = new Account();
		accountJohn.balance = 100;
		accountJohn.deposit(50);
		System.out.println(accountJohn.balance);
		
		if (accountJohn.withdraw(20)) {
			System.out.println("successfull withdraw");
		} else {
			System.out.println("balance insufficient");
		}
		
		
		Account accountMary = new Account();
		accountMary.deposit(1000);
		
		if (accountMary.transfer(300, accountJohn)) {
			System.out.println("successfull transfer");
		} else {
			System.out.println("unanswered transfer, balance insufficient");
		}
		
		System.out.println("Mary account balance: " + accountMary.balance);
		System.out.println("John account balance: " + accountJohn.balance);
	}
}
