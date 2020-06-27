
public class ConditionalTests2 {
	
	public static void main(String[] args) {
		int age = 16;
		int amountPeople = 2;
		boolean accompanied = amountPeople > 1;
		
		if (age >= 18 || accompanied) {
			System.out.println("Welcome");
		} else {
			System.out.println("Sorry, but you cannot enter");
		}
	}
}
