package exercise1;

import exercise2.Payable;

public abstract class Employee implements Payable {
	protected String name;
	protected int sales=0;
	protected int workedHours=0;

	Employee(String a)
	{
		name=a;
	}

	public abstract int computeSalary();

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
