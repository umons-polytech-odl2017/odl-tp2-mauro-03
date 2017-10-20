package exercise1;



public class WorkHourSalaryEmployee extends Employee {
	private int hourSalary, hourlyRoute;
	private int hour;


	public WorkHourSalaryEmployee(String name, int hourlyRoute){
		super(name);
		this.hourlyRoute=hourlyRoute;
	}

	//public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute) {return null;}

	@java.lang.Override
	public int computeSalary() {

		hourSalary=hourlyRoute*hour;
		return hourSalary;
	}

	@java.lang.Override
	public void sell() {}

	@java.lang.Override
	public void workOneHour() {
		hour++;
	}
}
