package factory_pattern;

public class TestingMain {

	public static void main(String[] args) {
		Employee employee1 = new FullTimeEmployee();
		employee1.getWorkHrForDay();
		employee1.getSalaryPerHour();
		employee1.getSalaryForDay();
		
		Employee employee2 = new PartTimeEmployee();
		employee2.getWorkHrForDay();
		employee2.getSalaryPerHour();
		employee2.getSalaryForDay();
	}
}
