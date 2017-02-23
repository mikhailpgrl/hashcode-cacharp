public class Requests {
	
	int nb_requests;
	Videos video;
	Endpoint endpoint;	
	
	public Requests(int nb_requests,Videos video,Endpoint endpoint){
		this.nb_requests = nb_requests;
		this.video = video;
		this.endpoint = endpoint;
	}
	
	public int get_nb_request(){
		return nb_requests;
	}
	
	public Videos get_video(){
		return this.video;
	}
	
	public Endpoint get_endpoint(){
		return this.endpoint;
	}
	
	
}
