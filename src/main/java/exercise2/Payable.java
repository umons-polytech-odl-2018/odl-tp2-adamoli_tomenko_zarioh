package exercise2;

//import exercise1.Exercise1;

//on crée la fameuse interface ("classe abstraite sans attributs") qui va permettre de mettre en évidence la méthode
//computeSalary pour toutes les classes qui l'implémentererons

public interface Payable {
	int computeSalary();
}
//NB : pas de public car c'est redondant pour une méthode d'une interface
//même remarque pour abstract
//c'est assez logique car une itnerface n'est PAS UNE CLASSE
//si on se souvient du cas de la classe abstraite employee, là il faut dire que certaines méthodes sont
//public (çà c'est très logique par le principe meme de méthode) et abstract (qu'elles vont etre override)
//ici d'une certaine façon oui on va override, mais pas vraiment comme avec une classe
