package Base;

import java.util.*;

public class Expression{
	private Noeud racine;
	private String nom;
	public Expression (String nom, String valeur){
		this.nom = nom;
		this.racine = new Noeud (valeur);
	}
	public boolean reconnait (String u){
		throw new UnsupportedOperationException();
	}
	public boolean reconnait (Lettre a){
		throw new UnsupportedOperationException();
	}
	public Automate versAutomate (){
		throw new UnsupportedOperationException();
	}
	public Expression concatenation (Expression exp){
		throw new UnsupportedOperationException();
	}
	public Expression intersection (Expression exp){
		throw new UnsupportedOperationException();
	}
	public Expression union (Expression exp){
		throw new UnsupportedOperationException();
	}
	public Expression complementaire (Expression exp){
		throw new UnsupportedOperationException();
	}
	public Expression etoile (){
		throw new UnsupportedOperationException();
	}
	public boolean estFini (){
		throw new UnsupportedOperationException();
	}
	public boolean estDeCardinal (int k){
		throw new UnsupportedOperationException();
	}
	public boolean estVide (){
		throw new UnsupportedOperationException();
	}
	public boolean estContenu (Expression exp){
		throw new UnsupportedOperationException();
	}
	public String getNom (){
		return this.nom;
	}
	public String toString (){
		if (this.racine == null)
			return "\u03B5";
		else return this.racine.toString ();
	}
	public static boolean estCorrecte (String s){
		try{
			new Expression ("", s);
		}catch (Exception e){
			return false;
		}
		return true;
	}
}
