package in.cdac.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {
		Map<Integer, String > mp = new HashMap<>();
		
		// Add elements into map
		mp.put(01, "Roughe") ;
		mp.put(02, "Noir") ;
		mp.put(03, "Blanc") ;
		mp.put(04, "Jaune") ;
		mp.put(05, "Violet") ;
		mp.put(06, "Bleu") ;
		mp.put(07, "Vert") ;
		
		System.out.println(mp);
		
	//	mp.remove(07);
		// to get specific value
		System.out.println("Black Primordial : " + mp.get(02));
		
		// to check if a key exists
		System.out.println(mp.containsKey(01));
		System.out.println(mp.containsValue("Silva"));
		
		// to print only keys 
		System.out.println("To print key Sets : \n " +mp.keySet());
		 
		System.out.println();
		
		// to print only values
		System.out.println("To print only values sets : \n" + mp.values());
		
	}

}
