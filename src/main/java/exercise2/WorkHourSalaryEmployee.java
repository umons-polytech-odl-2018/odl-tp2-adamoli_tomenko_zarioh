package exercise2;

public class WorkHourSalaryEmployee extends Employee {
	private int hourRate;

	public WorkHourSalaryEmployee(String a, int b)
	{
		super(a);
		hourRate=b;
	}

	@Override
	public int computeSalary()
	{
		return hourRate*workedHours;
	}

}
