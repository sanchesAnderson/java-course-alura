
public class GetsAndSets {
	
	public static void main(String[] args) {
		
		Account account = new Account(3440, 1337255);
		
		Client paul = new Client();
		paul.setName("Paul Sander");
		account.setHolder(paul);
		System.out.println(account.getHolder().getName());
		account.getHolder().setProfession("developer");
		
		//Now in two lines
		Client holderAccount = account.getHolder();
		holderAccount.setProfession("developer");
		
		System.out.println(paul);
		System.out.println(holderAccount);
		System.out.println(account.getHolder());
	}
}
