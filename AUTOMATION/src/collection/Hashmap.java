package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String>name=new HashMap<Integer, String>();
		
		name.put(9, "shivani");
		name.put(8, "shivani");
		name.put(7, "shivani");
		name.put(6, "shivani");
		name.put(5, "shivani");
		name.put(4, "shivani");
		name.put(3, "shivani");
		name.put(2, "shivani");
		name.put(1, "shivani");
		name.put(null, null);
		name.put(10, null);
		name.put(0, "meena");
		
		
		System.out.println(name);
		
		System.out.println(name.size());
		
		name.remove(5);
		System.out.println(name);
		
		name.remove(3, "shivani");
		System.out.println(name);
		
		System.out.println(name.clone());
		
		System.out.println(name.containsValue("shivani"));
		
		name.replace(2,"panzade");
		System.out.println(name);
		
		name.replace(1, "shivani","lata");
		System.out.println(name);
		
		Collection<String> z = name.values();
		System.out.println(z);
		
		Set<Integer> m = name.keySet();
		System.out.println(m);
		
		
		
		
	}

}
