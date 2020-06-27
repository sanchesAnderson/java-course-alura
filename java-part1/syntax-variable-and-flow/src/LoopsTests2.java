
public class LoopsTests2 {

	public static void main(String[] args) {

		for (int multiplying = 1; multiplying <= 10; multiplying++) {

			for (int multiplier = 0; multiplier <= 10; multiplier++) {

				System.out.println(multiplying + " x " + multiplier + ": " + (multiplying * multiplier));
			}

			System.out.println("-------------");
		}
	}
}
