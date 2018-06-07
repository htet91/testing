package factory_pattern;

public class FullTimeEmployee extends Employee {

	@Override
	public void getSalaryPerHour() {
		this.salaryPerHour = 7000;
	}

	@Override
	public void getWorkHrForDay() {
		this.workHrForDay = 8;
	}

}
