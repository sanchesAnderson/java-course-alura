
public class ConditionalTests {
	
	public static void main(String[] args) {
		int age = 20;
		int amountPeople = 3;
		
		if (age >= 18) {
			System.out.println("You are over 18");
			System.out.println("Welcome");
		} else {
			if (amountPeople >= 2) {
				System.out.println("You have not 18, but you can enter, because you are accompanied");
			} else {
				System.out.println("Sorry, but you cannot enter");
			}
		}
	}
}
