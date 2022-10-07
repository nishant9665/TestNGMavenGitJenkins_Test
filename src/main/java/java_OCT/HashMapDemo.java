package java_OCT;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> m=new HashMap<Integer,String>();  
	       m.put(1,"Chris");  //Adding elements in Map    
	       m.put(2,"Morris");      
	       m.put(3,"Sam");     
	       m.put(4,"Cruise");      
	       System.out.println("Iterating Hashmap...");    
	       for(Entry<Integer, String> me : m.entrySet()){      
	        System.out.println(me.getKey()+" "+me.getValue());      
	       }  
	       
	       
	     //Implementation of the LinkedHashMap  
	       LinkedHashMap<Integer,String> l=new LinkedHashMap<Integer,String>();   
	       l.put(100,"John");  // Adding Elements  
	       l.put(101,"Dev");    
	       l.put(102,"Arya");  
	       l.put(103,"Zoya");  
	     for(Map.Entry m2:l.entrySet()){    
	        System.out.println(m2.getKey()+" "+m2.getValue());    
	       }    

	}

}
