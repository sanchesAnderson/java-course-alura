
public class EmployeeTests {
	
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		manager.setName("Philipe");
		manager.setSalary(5000.0);
		
		ControlBonus controlBonusManager = new ControlBonus();
		
		controlBonusManager.register(manager);
		
		Manager manager1 = new Manager();
		Editor editor1 = new Editor();
		
		manager1.setSalary(1000.0);
		editor1.setSalary(1000.0);
		
		ControlBonus controlBonus = new ControlBonus();
				
		controlBonus.register(manager1);
		System.out.println(controlBonus.getSum());
		
		controlBonus.register(editor1);
		System.out.println(controlBonus.getSum());
		
	}
}
