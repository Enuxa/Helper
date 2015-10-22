package Commandes;

import Base.*;

public class Sortie extends Commande{
	public Sortie (){
		super ("exit");
	}
	public boolean executer (String[] args){
		System.exit (0);
		return true;
	}
	public String manuel (){
		return super.toString () + "\nTermine le programme.";
	}
}
