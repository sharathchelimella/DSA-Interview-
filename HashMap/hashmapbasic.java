
//HASHMAP

import java.util.*;
public class Main{
	public static void main(String[] args) {
	    HashMap<String, Integer> map = new HashMap<>();
	    
	    
	    //Instertion of elements
	    map.put("india",150);
	    map.put("china", 180);
	    map.put("US", 100);
	    //System.out.print(map);
	    
	   // System.out.println(map.get("china"));  // If key presents the it will prints the value
	   // System.out.println(map.get("iran"));  //if it is not present it will print null
	    
	    
	   //To check whether the key is present oe not
	    
	   // if(map.containsKey("china")){
	   //     System.out.println("key is present");
	   // }else{
	   //     System.out.println("key is not present");
	   // }
	   
	   
	   
	   //Iteration in HashMap
	   
	   //Entry set --> consist of both  vey and value pairs
	   //for(Map.Entry<String,Integer> e : map.entrySet()){
	   //    System.out.println(e.getKey());
	   //    System.out.println(e.getValue());
	   //}
	   
	   //Keyset consist of entire set of Keyset
	   //but we can retrive the both keys and values by usinig 
	   
	   //Set<String> keys = map.keySet();
	   //for(String key :keys ){
	   //    System.out.print(key + " " +map.get(key));
	   //}
	   
	   
	   
	   //To remove the key and values
	   
	   map.remove("china");
	   System.out.print(map);
	}
}