package exercise1;

public abstract class Employee {
	protected String name;
	protected int sales=0;
	protected int workedHours=0;
	protected int salary;

	public int computeSalary() {
		return 0;
	}

	public void sell() {
		sales++;
	}

	public void workOneHour() {
		workedHours++;
	}

	public String getName() {
		return name;
	}
}
