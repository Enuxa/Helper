package Base;

public class Alphabet{
	private Lettre[] elements;
	public Alphabet (Lettre[] t){
		this.elements = t;
	}
	public Alphabet (String[] t){
		this.elements = new Lettre[t.length];
		for (int i = 0; i < t.length; i++)
			this.elements[i] = new Lettre (t[i]);
	}
	public boolean contient (String a){
		for (int i = 0; i < this.elements.length; i++){
			if (this.elements[i].equals (a))
				return true;
		}
		return false;
	}
	public String[] getNomsLettres (){
		String[] t = new String [this.elements.length];
		for (int i = 0; i < t.length; i++)
			t[i] = this.elements[i].toString();
		return t;
	}
}
