package Generic;

import java.util.ArrayList;

public class Without_Generic {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add("Pravin");
		list.add(123);
		for(Object obj:list) {
	String str=(String)obj;
		System.out.println(obj);
	}
}
}