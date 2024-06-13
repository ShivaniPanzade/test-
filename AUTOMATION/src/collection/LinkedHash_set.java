package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash_set {

	public static void main(String[] args) {
		LinkedHashSet<Float>school=new LinkedHashSet<Float>();
		
		//using for loop
	for(float s=1.1f; s<=70.1f; s++) {
        school.add(s);
	    }
		System.out.println(school);
		
		System.out.println(school.contains(1.1f));
		//System.out.println(school);
		
		System.out.println(school.clone());
		
		System.out.println(school.isEmpty());
		
		System.out.println(school.remove(44.1f));
		System.out.println(school);
		
		System.out.println(school.add(78.8f));
		System.out.println(school);
		
		
		System.out.println(school.equals(79.1f));
		
		System.out.println(school.add(null));
		
		System.out.println(school.add(null));
		
		System.out.println(school.size());
		System.out.println(school);
		System.out.println("-------------------------------------------------------------------");
		
		//iterator
		Iterator<Float> d = school.iterator();
		while (d.hasNext()) {
		System.out.println(d.next());
		
		}}}

	
