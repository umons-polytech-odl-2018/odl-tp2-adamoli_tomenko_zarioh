package exercise1;
/**
 * classe ou le salaire =
 * salaire de base + vente*commision*/
public class BaseSalaryPlusCommissionEmployee extends Employee{
	private int baseSalary;
	private int commission;

	public BaseSalaryPlusCommissionEmployee(String a, int b, int c)
	{
		super(a);
		baseSalary=b;
		commission=c;
	}
	//la classe abstraite contient la définition précise de la méthode abstraite définie dans la classe abstraite
	//du coup il faut l'override (dire que je redéfini ma fct dans ce cas-ci
	//la classe abstraite permet donc des mises en évidence de propriété
	//un peu comme l'interface, sauf que cette dernière n'a pas d'attributs
	@Override
	public int computeSalary()
	{
		return baseSalary+sales*commission;
	}

}
