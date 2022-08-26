package Collections;

import java.util.HashMap;

public class map_functions {
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("smita",3);
		map.put("sachin",4);
		map.put("nikam",1);
System.out.println(map);
       System.out.println(map.size());
       System.out.println(map.values());
       System.out.println(map.keySet());
       System.out.println(map.entrySet());
		
	}

}
