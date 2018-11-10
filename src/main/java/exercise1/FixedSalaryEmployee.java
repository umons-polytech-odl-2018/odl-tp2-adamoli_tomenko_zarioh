package exercise1;
/**
 * classe ou le salaire est fixe*/
public class FixedSalaryEmployee extends Employee{
	private int fixedSalary;
	public FixedSalaryEmployee(String a, int b)
	{
		super(a);
		fixedSalary=b;
	}

	@Override
	public int computeSalary()
	{
		return fixedSalary;
	}
}
