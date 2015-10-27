import Base.*;

public class Test{
	public static void main (String[] args){
		Memoire.initialiser ();
		Alphabet alph = new Alphabet (new String[] {"a", "b", "c"});
		Memoire.setAlphabet (alph);
		System.out.println (alph.contient ("b"));
		Memoire.addExpression (new Expression ("E2", args[0]));
		String[] noms = Memoire.getNomsExpressions ();
		for (int i = 0; i < noms.length; i++){
			Expression e = Memoire.getExpression (noms[i]);
			System.out.println (e.getNom () + " = " + e);
		}
	}
}
