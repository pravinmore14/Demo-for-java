
public class Swaping {

	public static void main(String[] args) {
int a=10;
int b=20;
System.out.println("value of a before swaping "+a);
System.out.println("value of b before swaping "+b);

a=b+a;  
b=a-b; 
a=a-b;

System.out.println("value of a after swaping "+a);
System.out.println("value of b after swaping "+b);
	}

}
