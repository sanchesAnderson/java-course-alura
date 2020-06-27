
public class CalculateIR {
	
	public static void main(String[] args) {
		
		double salary = 1300.0;
		
		double startAliquot7 = 1900.0;
		double endAliquot7 = 2800.0;
		double tax7 = 142.0;
		
		double startAliquot15 = 2800.01;
		double endAliquot15 = 3751.0;
		double tax15 = 350.0;
		
		double startAliquot22 = 3751.01;
		double endAliquot22 = 4664.0;
		double tax22 = 636.0;
		
		if (salary >= startAliquot7 && salary <= endAliquot7) {
			
			System.out.println("tax of $" + tax7);
			
		} else if (salary >= startAliquot15 && salary <= endAliquot15) {
			
			System.out.println("tax of $" + tax15);
			
		} else if (salary >= startAliquot22 && salary <= endAliquot22) {
			
			System.out.println("tax of $" + tax22);
			
		} else {
			
			System.out.println("not defined tax for this salary");
			
		}
	}
}
