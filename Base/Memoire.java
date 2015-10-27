package Base;

import Commandes.*;
import java.util.*;

public class Memoire{
	private static List<Automate> automates;
	private static List<Expression> expressions;
	private static List<Commande> commandes;
	private static Alphabet alphabet;
	
	public static boolean removeAutomate (){
		throw new UnsupportedOperationException();
	}
	public static boolean addAutomate (Automate auto){
		throw new UnsupportedOperationException();
	}
	public static Automate getAutomate (String nom){
		throw new UnsupportedOperationException();
	}
	public static String[] getNomsAutomates (){
		String[] t = new String [automates.size ()];
		for (int i = 0; i < t.length; i++)
			t[i] = automates.get (i).getNom ();
		return t;
	}
	public static boolean removeExpression (String nom){
		Expression exp = getExpression (nom);
		if (exp == null)
			return false;
		else
			expressions.remove (exp);
		return true;
	}
	public static boolean addExpression (Expression e){
		if (getExpression (e.getNom ()) != null)
			return false;
		expressions.add (e);
		return true;
	}
	public static Expression getExpression (String nom){
		for (Expression e : expressions)
			if (e.getNom ().equals (nom))
				return e;
		return null;
	}
	public static String[] getNomsExpressions (){
		String[] t = new String [expressions.size ()];
		for (int i = 0; i < t.length; i++)
			t[i] = expressions.get (i).getNom ();
		return t;
	}
	public static boolean executer (String entree){
		String[] tab = entree.split (" ");
		ArrayList<String> list = new ArrayList<String> ();
		//	Elimination de mots vides
		for (int i = 0; i < tab.length; i++){
			if (!tab[i].equals (""))
				list.add (tab[i]);
		}
		tab = (String[])list.toArray (new String[list.size ()]);
		
		String[] args = tab.length > 1 ? (String[])Arrays.copyOfRange (tab, 1, tab.length) : new String[0];
		for (Commande c : commandes){
			if (c.estAppel (tab))
				return c.executer (args);
		}
		
		System.out.println ("Commande inconnue");
		
		return false;
	}
	public static String[] getNomsCommandes (){
		String[] t = new String [commandes.size ()];
		for (int i = 0; i < t.length; i++)
			t[i] = commandes.get (i).toString ();
		return t;
	}
	public static Commande getCommande (String cmd){
		for (Commande c : commandes){
			if (cmd.equals (c.toString ()))
				return c;
		}
		
		return null;
	}
	public static Alphabet getAlphabet (){
		return alphabet;
	}
	public static void setAlphabet (Alphabet alpha){
		alphabet = alpha;
	}
	public static void initialiser (){
		automates = new ArrayList<Automate> ();
		expressions = new ArrayList<Expression> ();
		commandes = new ArrayList<Commande> ();
		
		//	Chargement manuel des commandes
		commandes.add (new Lister ());
		commandes.add (new Manuel ());
		commandes.add (new Sortie ());
		commandes.add (new AssignerAlphabet ());
		commandes.add (new AfficherAlphabet ());
		commandes.add (new AssignerExpression ());
		
		alphabet = null;
	}
}
