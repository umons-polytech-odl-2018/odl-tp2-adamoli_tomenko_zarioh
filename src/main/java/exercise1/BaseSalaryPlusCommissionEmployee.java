package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee{
	private int baseSalary;
	private int commission;

	public BaseSalaryPlusCommissionEmployee(String a, int b, int c)
	{
		super(a);
		baseSalary=b;
		commission=c;
	}

	@Override
	public int computeSalary()
	{
		return baseSalary+sales*commission;
	}

}
