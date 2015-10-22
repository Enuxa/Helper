package Base;
public class Manuel extends Commande{
	public Manuel (){
		super ("man");
	}
	public boolean executer (String[] args){
		if (args.length == 0){
			System.out.println ("Veuillez spécifier la commande dont vous souhaitez obtenir le manuel.");
			return false;
		}
		
		Commande c =Memoire.getCommande (args[0]);
		if (c == null)
			System.out.println ("La commande \"" + args[0] + "\" n'existe pas.");
		else
			System.out.println (c.manuel ());
		
		return true;
	}
	public String manuel (){
		return super.toString () + "\nAffiche le manuel de la commande spécifiée en argument.";
	}
}
