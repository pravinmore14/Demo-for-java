package javapratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayList_in_descending {

	public static void main(String[] args) {
		List<Object> list= new ArrayList<>();
		list.add(40);
		list.add(10);
		list.add(50);
		list.add(20);
		Iterator<Object> itr=list.iterator();

	    Comparator<Object> cmp = Collections.reverseOrder();  
	    Collections.sort(list,cmp); 
	    while(itr.hasNext()) {
	    	
	    System.out.println(itr.next());	
	    }
	}
// Not running try it once
}
