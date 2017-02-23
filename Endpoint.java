import java.util.ArrayList;

public class Endpoint {
	int id;
	Integer data_latency;
	ArrayList<Cache> liste_cache;
		
	public Endpoint(int id,Integer data,Cache... valeurs){
		this.id = id;
		data_latency = data;
		liste_cache = new ArrayList<Cache>();
		for(int i = 0;i<valeurs.length;i++){
			liste_cache.add(valeurs[i]);
		}
	}
	
	public void add_caches(Cache a){
		liste_cache.add(a);
	}
	
	public int get_id(){
		return this.id;
	}
	
	public int get_latency(){
		return this.data_latency;
	}
	
	public ArrayList<Cache> get_liste_cache(){
		return liste_cache;
	}
	
	public Cache get_cache(int n){
		return liste_cache.get(n);
	}
	
	
}
