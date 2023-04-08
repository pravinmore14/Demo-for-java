
public class thisreferstoclassmethod {
public void addition(int a,int b) {
	
display();
int c=a+b;

System.out.println("addition" +c);
}
public void display () {
System.out.println("addition of two number");	
}
public static void main(String[]args) {
	thisreferstoclassmethod t1= new thisreferstoclassmethod();
	t1.addition(10,20);
}
}