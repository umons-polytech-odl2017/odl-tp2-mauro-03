package exercise1;

public class FixedSalaryEmployee extends Employee{

	private int fixedSalary;

	public FixedSalaryEmployee(String name, int fixedSalary ){
		super (name);
		this.fixedSalary=fixedSalary;
	}


	@java.lang.Override
	public int computeSalary() {
		return fixedSalary;
	}

	@java.lang.Override
	public void sell() {}

	@java.lang.Override
	public void workOneHour() {}
}
