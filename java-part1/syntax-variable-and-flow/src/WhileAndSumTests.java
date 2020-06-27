
public class WhileAndSumTests {
	
	public static void main(String[] args) {
		
		int counted = 0;
		int total = 0;
		
		while(counted <= 10) {
			total += counted;
			counted++;
		}
		
		System.out.println(total);
	}
}
