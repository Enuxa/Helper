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
		
		for (int i = 0; i < args.length; i++){
			if (Character.isDigit (args[i].charAt (0))){
				System.out.println ("Les chiffres ne sont pas acceptés dans l'alphabet.");
				return false;
			}
			if (args[i].length () > 1){
				System.out.println ("Veuillez saisir des lettres.");
				return false;
			}
			if (args[i].equals ("e")){
				System.out.println ("Le caractère e est reservé au mot vide");
				return false;
			}
		}
		
		Memoire.setAlphabet (new Alphabet (args));	
		
		return true;
	}
	public String manuel (){
		return super.toString () + "\nAssigne un alphabet.\nLa syntaxe est : setAlphabet a b c d ...";
	}
}
