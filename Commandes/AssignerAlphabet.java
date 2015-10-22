package Commandes;

import Base.*;

public class AssignerAlphabet extends Commande{
	public AssignerAlphabet (){
		super ("setAlphabet");
	}
	public boolean executer (String[] args){
		if (args.length == 0){
			System.out.println ("Veuillez lister les lettres de l'alphabet que vous souhaitez définir.");
			return false;
		}
		
		Memoire.setAlphabet (new Alphabet (args));	
		
		return true;
	}
	public String manuel (){
		return super.toString () + "\nAssigne un alphabet.\nLa syntaxe est : setAlphabet a b c d ...";
	}
}
