package javapratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist_revese {

	public static void main(String[] args) {


/**List list = new ArrayList<>();  
list.add(10);
list.add(20);
list.add(30);
list.add(40);


Iterator itr=list.iterator();
Collections.reverse(list);
  
while(itr.hasNext())  
{  
    System.out.println("list before reverse "+itr.next());  
  
}  
*/

List l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
Iterator itr=l.iterator();
Collections.reverse(l);
while(itr.hasNext()){
System.out.println(itr.next());
}
	}
}