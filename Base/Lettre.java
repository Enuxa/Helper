package Base;
public class Lettre implements Etiquette{
	private String a;
	public Lettre (String a){
		this.a = a;
	}
	public String toString (){
		return this.a;
	}
	public boolean equals (Lettre b){
		return this.a.equals (b.toString ());
	}
	public boolean reconnait (Lettre a){
		return this.equals (a);
	}
	public boolean reconnait (String s){
		return this.a.equals (s);
	}
}
