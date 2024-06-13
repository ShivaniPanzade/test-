package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList<Float>f=new LinkedList<Float>();
		f.add(0,4.5f);
		f.add(1,4.8f);
		f.add(2,4.7f);
		f.add(3,4.6f);
		f.add(4,4.5f);
		f.add(5,4.4f);
		f.add(6,4.3f);
		f.add(7,4.2f);
		f.add(8,4.2f);
		f.add(9,4.1f);
		f.add(null);
		
		System.out.println(f);
		
		System.out.println(f.size());
		
		System.out.println(f.clone());
		
		f.remove(4.2f);
		System.out.println(f);
		
		f.removeFirst();
		System.out.println(f);
		
        f.removeLast();
        System.out.println(f);
       
        System.out.println(f.peekFirst());
        
        System.out.println(f.peekLast());
        
        System.out.println(f.pollFirst());
        
        System.out.println(f.pollLast());
        System.out.println(f);
        
        f.add(56.67f);
        f.add(5.89f);
        System.out.println(f);
        
       f.addFirst(34.5f);
       f.addLast(34.56f);
        System.out.println(f);
        
        System.out.println(f.contains(4.4f));
        
        System.out.println(f.equals(4.5f));
        
        System.out.println(f.isEmpty());
        
        System.out.println(f.offerFirst(3.4f));
        System.out.println(f);
        
        System.out.println(f.offerLast(67.90f));
        System.out.println(f);
        
        System.out.println(f.getFirst());
        
        System.out.println(f.getLast());
        
        System.out.println(f.pop());
        
        //iterator
        Iterator<Float> i = f.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
	}

}
