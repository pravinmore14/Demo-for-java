package Generic;

import java.util.ArrayList;

public class With_Generics {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Pravin");
		///list.add(123);   ///here it will shows compile time error and after running ClassCastException not occured.
		for(Object obj:list) {
	String str=(String)obj;
		System.out.println(obj);
	}
}
}
