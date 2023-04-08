import java.util.ArrayList;
public class ArrayList_Add {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		
		al.add("a");
		al.add("b");
		al.add(20);
		al.add("a");  //hence we can add duplicates in arraylist
		al.add(null);  
	al.add(null); 
	//al.retainAll(al);
//System.out.println(al);
	
		//hence we can add Multiple null values in arraylist
		System.out.println("Values od al are:"+al);
		
	
ArrayList al1 =new ArrayList();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		   //hence we can add Multiple null values in arraylist
		System.out.println("Values of al1 are:"+al1);
		al.addAll(al1);
		System.out.println(al);
		al1.addAll(2,al);
		System.out.println("values of al1 after adding  at 2 position :"+al1);
		//System.out.println(al1);
		System.out.println(al1.containsAll(al)); 
		System.out.println(al1.get(3)) ;
		//System.out.println(al1.iterator());
		//System.out.println(al1.hashCode()); //it will return hashcode value 
		al1.add(12, "see");
		System.out.println(al1);
	}
}
