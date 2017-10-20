package exercise1;

public abstract class Employee {
	private String name;

	public Employee(){}
	public Employee(String name){
		this.name=name;
	}


	public abstract int computeSalary();

	public abstract void sell();

	public abstract void workOneHour();

	public String getName() {
		return name;
	}

}

