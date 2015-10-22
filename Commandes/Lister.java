package Commandes;

import Base.*;

public class Lister extends Commande{
	public Lister (){
		super ("lister");
	}
	public boolean executer (String[] args){
		if (args.length == 0){
			System.out.println ("Veuillez spécifier ce que vous souhaitez afficher : \"automates\" pour les automates, \"expressions\" pour les expressions ou \"commandes\" pour les commandes.");
			return false;
		}
		String[] tab = null;
		if (args[0].equals ("automates"))
			tab = Memoire.getNomsAutomates ();
		if (args[0].equals ("expressions"))
			tab = Memoire.getNomsExpressions ();
		if (args[0].equals ("commandes"))
			tab = Memoire.getNomsCommandes ();
		
		if (tab == null){
			System.out.println ("\"" + args[0] + "\" est un choix incorrect : veuillez demander \"automates\" pour les automates, \"expressions\" pour les expressions ou \"commandes\" pour les commandes.");
			return false;
		}
		
		System.out.println (tab.length + " " + args[0]);
		for (int i = 0; i < tab.length; i++)
			System.out.println ("\t-" + tab[i]);
		
		return true;
	}
	public String manuel (){
		return super.toString () + "\nAffiche une liste des objets spécifiés en argument.\n" +
		"\tArguments acceptés :\n\t\t-automates\n\t\t-expressions\n\t\t-commandes";
	}
}
