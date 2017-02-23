import java.util.HashMap;

public class Videos {
	int id;
	int taille;
	
	public Videos(int id,int taille){
		this.id=id;
		this.taille = taille;
	}
	
	public int get_id(){
		return this.id;
	}
	
	public int get_taille(){
		return this.taille;
	}
	
}
