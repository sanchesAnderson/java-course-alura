
public class createAccount {
	
	public static void main(String[] args) {
		
		Account firstAccount = new Account();
		firstAccount.balance = 200;
		firstAccount.balance += 100;
		
		Account secondAccount = new Account();
		secondAccount.balance = 50;
		
		System.out.println("first account have " + firstAccount.balance);
		System.out.println("secound account have " + secondAccount.balance);
		
	}

}
