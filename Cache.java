public class Cache {
	int latency_time;
	int id;
	
	
	public Cache(int id,int time){
		this.id = id;
		this.latency_time = time;
	}
	
	public int get_id(){
		return this.id;
	}
	
	public int get_latency_time(){
		return this.latency_time;
	}
	
	
}
