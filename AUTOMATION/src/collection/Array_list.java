package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {

	
	public static void main(String[] args) {
	 ArrayList<Integer>sr_no=new ArrayList <Integer>();

	 sr_no.add(11);
	 sr_no.add(12);
	 sr_no.add(13);
	 sr_no.add(14);
	 sr_no.add(15);
	 sr_no.add(16);
	 sr_no.add(17);
	 sr_no.add(18);
	 sr_no.add(19);
	 sr_no.add(19);
	 sr_no.add(null);
	 
	 sr_no.add(5, 78);
	 System.out.println(sr_no);
	 
	 System.out.println(sr_no.contains(15));
	 
	 System.out.println(sr_no.clone());
	 
	 System.out.println(sr_no.isEmpty());
	 
	 sr_no.remove(5);
	 System.out.println(sr_no);
	 
	//iterator
     Iterator<Integer> i = sr_no.iterator();
     while(i.hasNext()) {
     	System.out.println(i.next());
     }
	 
	 
	 
	}

}
