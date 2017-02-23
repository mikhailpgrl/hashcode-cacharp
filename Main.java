import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class Main {
	static String s="";
	static ArrayList<Videos> liste_video;
	static ArrayList<Endpoint> liste_endpoint;
	static ArrayList<Cache> liste_cache;
	
	public static void lecture_fichier(String filename){
	BufferedReader br ;
	int nb_video,nb_endpoint,nb_requests,nb_caches;
	int k=0;
	try {
		br = new BufferedReader(new FileReader(filename));
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();
	    String[] tmp  = line.split(" ");
	    nb_video = Integer.parseInt(tmp[0]);
	    nb_endpoint = Integer.parseInt(tmp[1]);
	    nb_requests = Integer.parseInt(tmp[2]);
	    nb_caches = Integer.parseInt(tmp[3]);
	    line = br.readLine();
	    tmp = line.split(" ");
	    for(int i = 0;i<tmp.length;i++){
	    	liste_video.add(new Videos(i,Integer.parseInt(tmp[i])));
	    }
	    // il faut trouver la condition d'arret
	    do{
	    line = br.readLine();
	    tmp = line.split("");
	    liste_endpoint.add(new Endpoint(k++,tmp[0]));
	    for(int i = 0 ;i <Integer.parseInt(tmp[1]);i++){
	    	line = br.readLine();
	    	tmp = line.split(" ");
	    	liste_cache.add(new Cache(Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1])));
	    }
	    }while(tmp[1]!="0");

	    
	    
	    br.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static void parse_file(String s){
		System.out.println(s);
	}
	
	
	public static void main(String[]args){
		liste_video = new ArrayList<Videos>();
		liste_endpoint = new ArrayList<Endpoint>();
		lecture_fichier(args[0]);
		parse_file(s);
		
	}
	
	
	
}
