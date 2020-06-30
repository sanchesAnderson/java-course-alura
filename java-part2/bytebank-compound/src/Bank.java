
public class Bank {
	
	public static void main(String[] args) {
		
		Client john = new Client();
		
		john.name = "john Silveira";
		john.cpf = "222.333.444-55";
		john.profession = "developer";
		
		Account accountJohn = new Account();
		accountJohn.holder = john;
		System.out.println(accountJohn.holder.name);
		
		Account accountMary = new Account();
		accountMary.holder = new Client();
		accountMary.holder.name = "Mary";
		System.out.println(accountMary.holder.name);
	}
}
