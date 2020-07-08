
public class EmployeeTests {
	
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		manager.setName("Philipe");
		manager.setSalary(5000.0);
		
		Employee employee = new Employee();
		employee.setSalary(2000.0);
		
		ControlBonus controlBonusManager = new ControlBonus();
		
		controlBonusManager.register(manager);
		
		//System.out.println(controlBonusManager.getSum());
		
		ControlBonus controlBonusEmployee = new ControlBonus();
		
		controlBonusEmployee.register(employee);
		
		//System.out.println(controlBonusEmployee.getSum());
		
		Employee employee1 = new Employee();
		Manager manager1 = new Manager();
		Editor editor1 = new Editor();
		
		employee1.setSalary(1000.0);
		manager1.setSalary(1000.0);
		editor1.setSalary(1000.0);
		
		ControlBonus controlBonus = new ControlBonus();
		
		controlBonus.register(employee1);
		System.out.println(controlBonus.getSum());
		
		controlBonus.register(manager1);
		System.out.println(controlBonus.getSum());
		
		controlBonus.register(editor1);
		System.out.println(controlBonus.getSum());
		
	}
}
