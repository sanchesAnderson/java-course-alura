
public class References {

	public static void main(String[] args) {

		Account firstAccount = new Account();
		firstAccount.balance = 300;
		System.out.println("first account balance: " + firstAccount.balance);

		Account secoundAccount = firstAccount;
		System.out.println("secound account balance: " + secoundAccount.balance);
		secoundAccount.balance += 100;
		System.out.println("first account balance: " + firstAccount.balance);

		if (firstAccount == secoundAccount) {
			System.out.println("first iqual secound");
		} else {
			System.out.println("different account");
		}

		System.out.println(firstAccount);
		System.out.println(secoundAccount);
	}
}
