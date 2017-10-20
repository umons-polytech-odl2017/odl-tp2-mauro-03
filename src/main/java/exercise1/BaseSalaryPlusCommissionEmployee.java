package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee{

	private int commissionSalary, baseSalary, commission;
	private int sell;


	public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission){
		super(name);
		this.baseSalary=baseSalary;
		this.commission=commission;

	}
//public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
//		return null;}

	@java.lang.Override
	public int computeSalary() {
		commissionSalary=baseSalary + commission*sell;

		return commissionSalary;
	}

	@java.lang.Override
	public void sell() {
		sell++;
	}

	@java.lang.Override
	public void workOneHour() {}
}
