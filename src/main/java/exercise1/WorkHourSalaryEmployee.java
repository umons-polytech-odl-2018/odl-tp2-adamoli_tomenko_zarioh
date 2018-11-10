package exercise1;
/**
 * classe ou l'emplyé est payé par heure*/
public class WorkHourSalaryEmployee extends Employee{
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
