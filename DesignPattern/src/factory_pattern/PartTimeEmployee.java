package factory_pattern;

public class PartTimeEmployee extends Employee {

	@Override
	public void getSalaryPerHour() {
		this.salaryPerHour = 4000;
	}

	@Override
	public void getWorkHrForDay() {
		this.workHrForDay = 7;
	}

}
