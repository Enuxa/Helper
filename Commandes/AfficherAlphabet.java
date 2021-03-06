package Commandes;

import Base.*;

public class AfficherAlphabet extends Commande{
	public AfficherAlphabet (){
		super ("dispAlphabet");
	}
	public boolean executer (String[] args){
		Alphabet alphabet = Memoire.getAlphabet ();
		
		if (alphabet == null){
			System.out.println ("Aucun alphabet assigné");
			return false;
		}
		
		String[] t = alphabet.getNomsLettres ();
		
		System.out.print ("Alphabet : ");
		for (int i = 0; i < t.length; i++)
			System.out.print (t[i] + " ");
		System.out.println ();
		
		return true;
	}
	public String manuel (){
		return super.toString () + "\nAffiche l'alphabet en mémoire.";
	}
}
