package JavaRevision;

public class Initializing_objects_by_constructor {
	String name;
	int age;
	Initializing_objects_by_constructor (String name,int age){
		
		System.out.println(name+"  "+age);
	}
	public static void main(String[] args) {
		Initializing_objects_by_constructor e1 = new Initializing_objects_by_constructor("pravin",27);
		Initializing_objects_by_constructor e2 = new Initializing_objects_by_constructor("kshitij",25);
	}

}
