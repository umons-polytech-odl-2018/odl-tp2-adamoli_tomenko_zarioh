package exercise1;

import exercise2.Payable;//cet import est utile pour l'exo2, vu qu'on doit implémenter de l'interface playable
//çà évite de devoir copier coller des fichiers de façon pas propre au sein du projet !

//ici le implément payable permet de dire que la classe employé est construite sur base de l'interface
//(c'est donc un équivalent du extends, mais pour une interface
//enfin le abstract est la pour préciser qu'il s'agit d'une classe "abstraite", ie : qui ne sera jamais instentiée
//en tant que tel
public abstract class Employee implements Payable {
	protected String name;
	protected int sales=0;
	protected int workedHours=0;

	Employee(String a)
	{
		name=a;
	}

	public abstract int computeSalary();//méthode abstraite car va être override pour chaque classe instantiable
	//héritant de cette classe (ou de l'interface considéré si on a une interface)

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
