package JavaRevision;

public class Static_variable {
int a=10;                          //here a is instance variable and we can not used it below main method bcoz main method is static
static int b=30;
	public static void main(String[] args) {
		Static_variable s1= new Static_variable();
		System.out.println(s1.a);
		System.out.println(s1.b);
		s1.a=100;
		s1.b=300;
		
		Static_variable s2= new Static_variable();
		
		System.out.println(s2.a);
		System.out.println(s2.b);	// it will print b=300 bcoz of static variable can not initialize again it will refer current value
	}

}
