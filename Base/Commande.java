package Helper;
public abstract class Commande{
	private String nom;
	public Commande (String nom){
		this.nom = nom;
	}
	public boolean estAppel (String[] entree){
		return entree.length != 0 && entree[0].equals (this.nom);
	}
	public String toString (){
		return this.nom;
	}
	public String manuel (){
		return this.toString ();
	}
	public abstract boolean executer (String[] args);
}
