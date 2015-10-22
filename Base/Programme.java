package Base;
import java.util.*;

public class Programme{
	public void executer (){
		Memoire.initialiser ();
		
		boolean boucle = true;
		Scanner scanner = new Scanner (System.in);
		while (boucle){
			System.out.print (">");
			String entree = scanner.nextLine ();
			Memoire.executer (entree);
		}
	}
}
