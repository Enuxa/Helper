package Helper;
import java.util.*;

public class Helper{
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
