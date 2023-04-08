
public class constructor1 {
	
	int age;
	String name;
	
public constructor1() {
	System.out.println("in default constructor");
}

//public  constructor1(int age) {
//	System.out.println("employee age " +age);
//}
public  constructor1(String name) {
	System.out.println("employee name" +name);
}


	public static void main(String[] args) {
		constructor1 d1=new constructor1();
		//constructor1 d3=new constructor1(" 27");
		constructor1 d2=new constructor1(" ==>pravin");

	}

}
