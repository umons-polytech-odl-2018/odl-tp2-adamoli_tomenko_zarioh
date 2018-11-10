package exercise1;
//import statement
/**
 * @author ADAMOLI_TOMENKO_ZARIOH
 * @version 1.0
 */
/**
 * this is the main for exercise1*/
public class Exercise1 {
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {
		return new FixedSalaryEmployee(name, fixedSalary);
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		return new BaseSalaryPlusCommissionEmployee(name, baseSalary, commission);
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute) {
		return new WorkHourSalaryEmployee(name, hourlyRoute);
	}
}
