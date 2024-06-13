package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	public static void main(String[] args) {
		HashSet<Integer> come = new HashSet<Integer>();
		
		// using for loop
		for (int a = 1; a <= 50; a++) {
			come.add(a);

		}
		System.out.println(come);
		
		System.out.println(come.add(55));
		
		System.out.println(come.contains(44));
		
		System.out.println(come.isEmpty());
		
		System.out.println(come.remove(49));
		System.out.println(come);
		
		
		System.out.println(come.size());
		System.out.println(come.add(null));
		System.out.println(come.add(null));
		System.out.println(come);
	
		//iterator
        Iterator<Integer> i = come.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
		
		
	}

}
