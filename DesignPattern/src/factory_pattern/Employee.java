package factory_pattern;

public abstract class Employee {
	protected int salaryPerHour;
	protected int workHrForDay;
	
	public abstract void getSalaryPerHour();
	public abstract void getWorkHrForDay();
	
	public void getSalaryForDay() {
		System.out.println("Salary for day = " + (salaryPerHour * workHrForDay));
	}
}
