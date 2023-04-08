package Practise;
import java.util.*;
public class Practice {
	
 private int Id;
 private String Name;
 //private int i;
 void setName(String name){
		Name =name;
	}	
 
 
	String getName(){
		return Name;
	}
	
	 void setId(int id){
			Id= id;
		}
	
	int getId(){
		return Id;
	}
	public static void main(String []args) {
		
		Practice c=new Practice();
		c.setId(101);
		System.out.println("Id is:"+c.getId());
		c.setName("Ram");
		System.out.println("Name is:"+c.getName());
}}
