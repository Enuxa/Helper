package Commandes;

import Base.*;

public class AssignerExpression extends Commande{
	public AssignerExpression (){
		super ("setExpression");
	}
	public boolean executer (String[] args){
		if (args.length < 2){
			System.out.println ("Veuillez saisir le nom de l'expression rationnelle aisi que sa valeur");
			return false;
		}
		if (!Expression.estCorrecte (args[1])){
			System.out.println ("L'expression rationnelle est incorrecte !");
			return false;
		}
		Expression exp = Memoire.getExpression (args[0]);
		if (exp == null)
			Memoire.removeExpression (args[0]);
		
		exp = new Expression (args[0], args[1]);
		
		return true;
	}
	public String manuel (){
		return super.toString () + "\nCréé ou redifinit une expression rationnelle.\nLa syntaxe est : setExpression [nom] [valeur]";
	}
}
