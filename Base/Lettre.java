package Base;
public class Lettre implements Etiquette{
	private String a;
	public Lettre (String a){
		this.a = a;
	}
	public String toString (){
		return this.a;
	}
	public boolean equals (String b){
		return b.equals (this.a.toString ());
	}
	public boolean reconnait (Lettre a){
		return this.equals (a);
	}
	public boolean reconnait (String s){
		return this.a.equals (s);
	}
}
